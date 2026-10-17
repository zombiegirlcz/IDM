package m31;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.p1;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static k1 a(File file) {
        b1 b1VarB;
        Intrinsics.checkNotNullParameter(file, "file");
        String strD = o80.c.d(file);
        if (strD != null) {
            b1.Companion.getClass();
            b1VarB = a1.b(strD);
        } else {
            b1VarB = null;
        }
        RequestBody.Companion.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        return p1.a(file, b1VarB);
    }

    public final MultipartBody$Part b(File file, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(file, "file");
        e1 e1Var = MultipartBody$Part.Companion;
        String name2 = file.getName();
        k1 k1VarA = a(file);
        e1Var.getClass();
        return e1.c(name, name2, k1VarA);
    }
}
