package deb;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$ValidationError$PhoneIsInvalid;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f113349a;

    public b(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f113349a = phoneToolsProvider;
    }

    public static j c(j jVar, String str) {
        return j.b(jVar, new Data(str, new CustomerDetailsScreenContract$ValidationError$PhoneIsInvalid(), false, 4, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.data.model.Data a(java.lang.String r8, wi0.b r9) {
        /*
            r7 = this;
            com.revolut.data.model.Data r1 = new com.revolut.data.model.Data
            boolean r0 = kotlin.text.d0.W(r8)
            if (r0 != 0) goto L3e
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L1f
            z80.b r0 = r7.f113349a     // Catch: java.lang.Throwable -> L1f
            java.lang.CharSequence r2 = kotlin.text.d0.F0(r8)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r9 = r9.f297794a     // Catch: java.lang.Throwable -> L1f
            boolean r9 = r0.k(r2, r9)     // Catch: java.lang.Throwable -> L1f
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L1f
            goto L27
        L1f:
            r0 = move-exception
            r9 = r0
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r2 = r9 instanceof yhm.n
            if (r2 == 0) goto L2e
            r9 = r0
        L2e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L37
            goto L3e
        L37:
            com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$ValidationError$PhoneIsInvalid r9 = new com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$ValidationError$PhoneIsInvalid
            r9.<init>()
        L3c:
            r3 = r9
            goto L40
        L3e:
            r9 = 0
            goto L3c
        L40:
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: deb.b.a(java.lang.String, wi0.b):com.revolut.data.model.Data");
    }

    public final fj0.b b(wi0.b bVar) {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = this.f113349a.j(bVar);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        String str = (String) objA;
        if (str == null) {
            return null;
        }
        fj0.b.Companion.getClass();
        Serializable serializableB = fj0.a.b(str);
        return (fj0.b) (serializableB instanceof n ? null : serializableB);
    }
}
