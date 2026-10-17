package b22;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import do3.q;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k50.h0;
import k50.o0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lim.o;
import v20.u0;
import z20.t;
import zhm.d0;
import zs9.p;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f11863b;

    public /* synthetic */ j(File file, int i) {
        this.f11862a = i;
        this.f11863b = file;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IOException {
        File[] fileArrListFiles;
        String message;
        switch (this.f11862a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ArrayList files = d0.A0(update.f11857a, this.f11863b);
                Intrinsics.checkNotNullParameter(files, "files");
                return new e(files);
            case 1:
                br7.e updateState = (br7.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return br7.e.a(updateState, d0.A0(updateState.f17937c, this.f11863b));
            case 2:
                this.f11863b.delete();
                return Unit.f186387a;
            case 3:
                h0 update2 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                o0 o0Var = update2.e;
                List list = o0Var.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!Intrinsics.f(((u0) obj3).f285576a.getAbsolutePath(), this.f11863b.getAbsolutePath())) {
                        arrayList.add(obj3);
                    }
                }
                return h0.a(update2, null, null, null, null, o0.a(o0Var, null, 0L, null, null, false, arrayList, null, 95), null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435439);
            case 4:
                mu8.d update3 = (mu8.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                return new mu8.d(this.f11863b);
            case 5:
                File file = this.f11863b;
                Intrinsics.h(file);
                Data content = new Data(new owf.f(file), null, false, 6, null);
                ((owf.h) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                return new owf.h(content);
            case 6:
                List receiptsFilePaths = (List) obj2;
                Intrinsics.checkNotNullParameter(receiptsFilePaths, "receiptsFilePaths");
                return new Pair(receiptsFilePaths, this.f11863b);
            case 7:
                uyc.j update4 = (uyc.j) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return uyc.j.a(update4, null, d0.A0(update4.d, this.f11863b), 23);
            case 8:
                uyc.j update5 = (uyc.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return uyc.j.a(update5, null, d0.F0(this.f11863b, update5.d), 23);
            case 9:
                return new v94.g(new Data(this.f11863b, null, false, 6, null));
            case 10:
                File it8 = (File) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.isDirectory() && !it8.equals(this.f11863b) && (fileArrListFiles = it8.listFiles()) != null && fileArrListFiles.length == 0);
            case 11:
                Intrinsics.checkNotNullParameter((File) obj2, "it");
                return Boolean.valueOf(!Intrinsics.f(r0, this.f11863b));
            case 12:
                File folder = (File) obj2;
                Intrinsics.checkNotNullParameter(folder, "folder");
                File file2 = this.f11863b;
                File file3 = new File(folder, a0.d.r(o.o(file2), "_copy.jpg"));
                o.l(file2, file3);
                return file3;
            case 13:
                File chatDirectory = (File) obj2;
                Intrinsics.checkNotNullParameter(chatDirectory, "chatDirectory");
                File file4 = this.f11863b;
                FileInputStream input = new FileInputStream(file4);
                try {
                    Intrinsics.checkNotNullParameter(input, "input");
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(input);
                    input.close();
                    if (bitmapDecodeStream != null) {
                        String path = file4.getPath();
                        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                        Bitmap bitmapG = q.g(bitmapDecodeStream, path);
                        if (bitmapG != null) {
                            File file5 = new File(chatDirectory, a0.d.r(o.o(file4), "_transformed.jpg"));
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file5), 8192);
                            try {
                                bitmapG.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream);
                                bufferedOutputStream.close();
                                bitmapG.recycle();
                                return file5;
                            } finally {
                            }
                        }
                    }
                    String path2 = file4.getPath();
                    int i = (int) 14;
                    try {
                        byte[] bArr = new byte[i];
                        new FileInputStream(file4).read(bArr, 0, i);
                        message = kotlin.collections.d.a0(bArr, "", null, null, new z1i.l(6), 30);
                        break;
                    } catch (IOException e) {
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                    }
                    long length = file4.length();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(path2);
                    sb6.append(",header:");
                    sb6.append(message);
                    sb6.append(",size:");
                    throw new IllegalStateException(j6.a.q("Can't decode image ", a0.d.j(length, "b", sb6)));
                } finally {
                }
            default:
                p updateState2 = (p) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return p.a(updateState2, new FileImage(this.f11863b, (FileImage.Placeholder) null, (ImageTransformations) null, 14), null, null, null, null, false, 126);
        }
    }

    public /* synthetic */ j(File file, t tVar) {
        this.f11862a = 13;
        this.f11863b = file;
    }

    public /* synthetic */ j(su9.c cVar, File file) {
        this.f11862a = 12;
        this.f11863b = file;
    }
}
