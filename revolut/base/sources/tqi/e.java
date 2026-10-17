package tqi;

import android.content.Intent;
import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lim.m;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f273603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n80.d f273604b;

    public e(zk0.b fileSystemRepository, n80.d packageManagerResolver) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(packageManagerResolver, "packageManagerResolver");
        this.f273603a = fileSystemRepository;
        this.f273604b = packageManagerResolver;
    }

    public final ExternalDestination a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriI = ((a80.h) this.f273603a).i(file);
        Intrinsics.checkNotNullParameter(file, "file");
        String strD = o80.c.d(file);
        List listK = v.k(1, 1073741824);
        if (this.f273604b.a(strD, uriI, listK)) {
            Iterator it8 = listK.iterator();
            if (!it8.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it8.next();
            while (it8.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() | ((Number) it8.next()).intValue());
            }
            return new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, uriI, ((Number) next).intValue(), strD, 398);
        }
        Intrinsics.checkNotNullParameter(file, "file");
        String strD2 = o80.c.d(file);
        String name = file.getName();
        String name2 = file.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        Intrinsics.checkNotNullParameter(file, "file");
        b bVar = new b(name2, m.d(file));
        if (strD2 == null) {
            strD2 = "application/pdf";
        }
        return c(new c(name, null, bVar, strD2, 21));
    }

    public final ExternalDestination.ByIntent b(String subject, String message) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(message, "message");
        return c(new c(subject, message, null, null, 89));
    }

    public final ExternalDestination.ByIntent c(c cVar) throws IOException {
        Uri uriI;
        aim.f builder = new aim.f();
        String str = cVar.f273600a;
        if (str != null) {
            builder.put("android.intent.extra.SUBJECT", str);
        }
        String str2 = cVar.f273601b;
        if (str2 != null) {
            Object objI = str2;
            if (cVar.d) {
                objI = m70.a.i(str2);
            }
            builder.put("android.intent.extra.TEXT", objI);
        }
        a aVar = cVar.f273602c;
        if (aVar != null) {
            zk0.b bVar = this.f273603a;
            if (aVar instanceof b) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(((b) aVar).f273599b);
                try {
                    File fileN = ((a80.h) bVar).n(zk0.a.INTERNAL_CACHE, byteArrayInputStream, ((b) aVar).f273598a);
                    byteArrayInputStream.close();
                    uriI = fileN != null ? ((a80.h) bVar).i(fileN) : null;
                } finally {
                }
            } else {
                if (!(aVar instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                uriI = ((h) aVar).f273608a;
            }
            builder.put("android.intent.extra.STREAM", uriI);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        Intent intent = new Intent("android.intent.action.SEND");
        nim.a.F(intent, fVarB);
        nim.a.G(intent, cVar.e);
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        return new ExternalDestination.ByIntent(intentCreateChooser, 0);
    }
}
