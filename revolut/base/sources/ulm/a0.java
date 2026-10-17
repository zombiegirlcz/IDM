package ulm;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();
    public static final List e;
    public static final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f281060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f281061h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f281062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f281064c;
    public final String[] d;

    static {
        v vVar = v.f281152q;
        v vVar2 = v.f281153r;
        v vVar3 = v.f281154s;
        v vVar4 = v.k;
        v vVar5 = v.f281149m;
        v vVar6 = v.f281148l;
        v vVar7 = v.f281150n;
        v vVar8 = v.f281151p;
        v vVar9 = v.o;
        List listK = zhm.v.k(vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9);
        e = listK;
        List listK2 = zhm.v.k(vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, v.i, v.f281147j, v.f281145g, v.f281146h, v.e, v.f, v.d);
        f = listK2;
        y yVar = new y();
        v[] vVarArr = (v[]) listK.toArray(new v[0]);
        yVar.c((v[]) Arrays.copyOf(vVarArr, vVarArr.length));
        v1 v1Var = v1.TLS_1_3;
        v1 v1Var2 = v1.TLS_1_2;
        yVar.e(v1Var, v1Var2);
        yVar.d = true;
        yVar.a();
        y yVar2 = new y();
        List list = listK2;
        v[] vVarArr2 = (v[]) list.toArray(new v[0]);
        yVar2.c((v[]) Arrays.copyOf(vVarArr2, vVarArr2.length));
        yVar2.e(v1Var, v1Var2);
        yVar2.d = true;
        f281060g = yVar2.a();
        y yVar3 = new y();
        v[] vVarArr3 = (v[]) list.toArray(new v[0]);
        yVar3.c((v[]) Arrays.copyOf(vVarArr3, vVarArr3.length));
        yVar3.e(v1Var, v1Var2, v1.TLS_1_1, v1.TLS_1_0);
        yVar3.d = true;
        yVar3.a();
        f281061h = new a0(false, false, null, null);
    }

    public a0(boolean z, boolean z3, String[] strArr, String[] strArr2) {
        this.f281062a = z;
        this.f281063b = z3;
        this.f281064c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sslSocket, boolean z) {
        String[] enabledProtocols;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        Intrinsics.h(enabledCipherSuites);
        String[] strArrC = vlm.b.c(this, enabledCipherSuites);
        String[] strArr = this.d;
        if (strArr != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = vlm.h.t(enabledProtocols2, strArr, cim.b.e());
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.h(supportedCipherSuites);
        v.Companion.getClass();
        int iN = vlm.h.n(supportedCipherSuites);
        if (z && iN != -1) {
            String str = supportedCipherSuites[iN];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            strArrC = vlm.h.g(str, strArrC);
        }
        y yVar = new y(this);
        yVar.b((String[]) Arrays.copyOf(strArrC, strArrC.length));
        yVar.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        a0 a0VarA = yVar.a();
        if (a0VarA.c() != null) {
            sslSocket.setEnabledProtocols(a0VarA.d);
        }
        if (a0VarA.b() != null) {
            sslSocket.setEnabledCipherSuites(a0VarA.f281064c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f281064c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(v.Companion.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            v1.Companion.getClass();
            arrayList.add(u1.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof a0)) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        a0 a0Var = (a0) obj2;
        boolean z = a0Var.f281062a;
        boolean z3 = this.f281062a;
        if (z3 != z) {
            return false;
        }
        if (z3) {
            return Arrays.equals(this.f281064c, a0Var.f281064c) && Arrays.equals(this.d, a0Var.d) && this.f281063b == a0Var.f281063b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f281062a) {
            return 17;
        }
        String[] strArr = this.f281064c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f281063b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f281062a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb6 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb6.append(Objects.toString(b(), "[all enabled]"));
        sb6.append(", tlsVersions=");
        sb6.append(Objects.toString(c(), "[all enabled]"));
        sb6.append(", supportsTlsExtensions=");
        return j6.a.x(sb6, this.f281063b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
