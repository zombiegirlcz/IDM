package defpackage;

import a10.b;
import android.content.Context;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.a;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.ServiceState;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import sgm.e3;
import tmm.c;

/* JADX INFO: loaded from: classes22.dex */
public final class u1 extends l {
    public final Context I;

    public u1(Context context) {
        this.I = context;
    }

    public static void c(String str, File file, ZipOutputStream zipOutputStream) throws IOException {
        File file2 = new File(file, str);
        if (file2.exists()) {
            if (file2.isDirectory()) {
                for (String str2 : file2.list()) {
                    c(str + '/' + str2, file, zipOutputStream);
                }
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                zipOutputStream.putNextEntry(new ZipEntry(str));
                c.b(fileInputStream, zipOutputStream);
                fileInputStream.close();
                zipOutputStream.closeEntry();
                fileInputStream.close();
            } catch (Throwable th10) {
                try {
                    fileInputStream.close();
                } catch (Throwable th11) {
                    th10.addSuppressed(th11);
                }
                throw th10;
            }
        }
    }

    @Override // defpackage.l
    public final void a() {
        b(ServiceState.SEND_LOGS, new Object[0]);
        File filesDir = this.I.getFilesDir();
        File file = new File(filesDir, "ucube_lib.zip");
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                for (String str : filesDir.list(new a(3))) {
                    c(str, filesDir, zipOutputStream);
                }
                c("logs", filesDir, zipOutputStream);
                zipOutputStream.close();
                try {
                    c cVar = new c(this.H, new FileInputStream(file), 0);
                    cVar.H = this.H;
                    cVar.execute(new e3(this, cVar));
                } catch (IOException unused) {
                    notifyMonitor(TaskEvent.FAILED, this);
                } finally {
                    file.delete();
                }
            } finally {
            }
        } catch (Exception e) {
            v1.b(b.r(e, new StringBuilder("Error to save log as zip ")), new Exception[0]);
            notifyMonitor(TaskEvent.FAILED, this);
        }
    }
}
