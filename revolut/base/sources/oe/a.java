package oe;

import fc.g;
import ie.h;
import ie.i;
import ie.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import le.k2;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final me.b f224491g = new me.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f224492h = new i(2);
    public static final h i = new h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f224493a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f224494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f224495c;
    public final k d;

    public a(c cVar, g gVar, k kVar) {
        this.f224494b = cVar;
        this.f224495c = gVar;
        this.d = kVar;
    }

    public static void a(List list) {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ((File) it8.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
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

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th10) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f224494b;
        arrayList.addAll(c.m(((File) cVar.f).listFiles()));
        arrayList.addAll(c.m(((File) cVar.f224500g).listFiles()));
        i iVar = f224492h;
        Collections.sort(arrayList, iVar);
        List listM = c.m(((File) cVar.e).listFiles());
        Collections.sort(listM, iVar);
        arrayList.addAll(listM);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.m(((File) this.f224494b.d).list())).descendingSet();
    }

    public final void d(k2 k2Var, String str, boolean z) {
        c cVar = this.f224494b;
        int i2 = this.f224495c.b().f245004a.f4745a;
        f224491g.getClass();
        try {
            f(cVar.h(str, p.a.p("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f224493a.getAndIncrement())), z ? "_" : "")), me.b.f204589a.a(k2Var));
        } catch (IOException e2) {
            String str2 = "Could not persist event for session " + str;
        }
        h hVar = new h(3);
        cVar.getClass();
        File file = new File((File) cVar.d, str);
        file.mkdirs();
        List<File> listM = c.m(file.listFiles(hVar));
        Collections.sort(listM, new i(3));
        int size = listM.size();
        for (File file2 : listM) {
            if (size <= i2) {
                return;
            }
            c.l(file2);
            size--;
        }
    }
}
