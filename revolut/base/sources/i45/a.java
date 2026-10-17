package i45;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import x35.h;
import yqi.b;
import yqi.c;
import yqi.d;
import yqi.f;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0908a f158284a = new C0908a();

    /* JADX INFO: renamed from: i45.a$a, reason: collision with other inner class name */
    public static final class C0908a implements b {
    }

    @Override // yqi.f
    public final d validate(Object obj2) {
        cnm.a aVar;
        wi0.b bVarA;
        h validationData = (h) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        ArrayList arrayList = new ArrayList();
        cnm.a[] DEFAULT_FORMATS = cnm.b.f25473b;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_FORMATS, "DEFAULT_FORMATS");
        int length = DEFAULT_FORMATS.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = DEFAULT_FORMATS[i];
            String str = aVar.f25470a;
            validationData.getClass();
            try {
                String strU0 = f0.U0(2, validationData.f302658a);
                wi0.b.Companion.getClass();
                bVarA = wi0.a.a(strU0);
            } catch (IllegalArgumentException unused) {
                bVarA = null;
            }
            if (Intrinsics.f(str, bVarA != null ? bVarA.f297794a : null)) {
                break;
            }
            i++;
        }
        cnm.b bVar = aVar != null ? new cnm.b(aVar) : null;
        if (aVar == null || bVar == null) {
            d.Companion.getClass();
            return c.a(validationData);
        }
        if (!bVar.a(validationData.b())) {
            arrayList.add(this.f158284a);
        }
        return new d(validationData, arrayList);
    }
}
