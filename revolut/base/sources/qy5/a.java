package qy5;

import aim.f;
import android.graphics.Bitmap;
import android.graphics.Rect;
import b9.v0;
import bi.b;
import bi.c;
import bi.e;
import bi.g;
import ch.qos.logback.core.CoreConstants;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.youTransactor.uCube.rpc.Constants;
import cv6.q;
import dvk.n;
import fag.t0;
import gr6.m;
import gsb.h;
import gsb.i;
import gsb.j;
import igm.o;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.Future;
import jel.c3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pr6.k;
import t17.l;
import vh.d;
import z0h.k1;
import z0h.m1;
import z0h.n1;
import z0h.r1;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d, b, ck.a, f8.a, z8.a, o, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250156a;

    public /* synthetic */ a(int i) {
        this.f250156a = i;
    }

    public static void s(c cVar, StringBuilder sb6) {
        char cCharAt = sb6.charAt(0);
        int iCharAt = (sb6.charAt(1) * CoreConstants.LEFT_PARENTHESIS_CHAR) + (cCharAt * 1600) + sb6.charAt(2) + 1;
        cVar.f15342c.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb6.delete(0, 3);
    }

    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f250156a) {
            case 21:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length != 7) {
                    throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
                }
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                Object obj5 = objArr[2];
                Object obj6 = objArr[3];
                Object obj7 = objArr[4];
                Object obj8 = objArr[5];
                Object obj9 = objArr[6];
                throw null;
            default:
                return obj2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [byte[], java.io.Serializable] */
    @Override // vh.d
    public yh.b b(String str, vh.a aVar, int i, int i2, f fVar) {
        int i3;
        int i5;
        e eVar;
        int i6;
        yh.b bVar;
        int i21;
        int i22;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != vh.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        bi.f fVar2 = bi.f.FORCE_NONE;
        bi.f fVar3 = (bi.f) fVar.get(vh.b.DATA_MATRIX_SHAPE);
        if (fVar3 != null) {
            fVar2 = fVar3;
        }
        if (fVar.get(vh.b.MIN_SIZE) != null) {
            throw new ClassCastException();
        }
        if (fVar.get(vh.b.MAX_SIZE) != null) {
            throw new ClassCastException();
        }
        int i32 = 4;
        int i33 = 0;
        b[] bVarArr = {new he2.b(i32), new a(i32), new g(i33), new g(1), new r39.a(), new p96.a(i32)};
        c cVar = new c(str);
        cVar.f15341b = fVar2;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            cVar.d((char) 236);
            cVar.f15343g = 2;
            cVar.d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            cVar.d((char) 237);
            cVar.f15343g = 2;
            cVar.d += 7;
        }
        int i43 = 0;
        while (cVar.b()) {
            bVarArr[i43].g(cVar);
            int i59 = cVar.e;
            if (i59 >= 0) {
                cVar.e = -1;
                i43 = i59;
            }
        }
        StringBuilder sb6 = cVar.f15342c;
        int length = sb6.length();
        cVar.c(sb6.length());
        int i66 = cVar.f.f15348b;
        if (length < i66 && i43 != 0 && i43 != 5 && i43 != 4) {
            cVar.d((char) 254);
        }
        if (sb6.length() < i66) {
            sb6.append((char) 129);
        }
        while (sb6.length() < i66) {
            int length2 = ((sb6.length() + 1) * 149) % Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION;
            int i74 = length2 + 130;
            if (i74 > 254) {
                i74 = length2 - 124;
            }
            sb6.append((char) i74);
        }
        String string = sb6.toString();
        e eVarE = e.e(string.length(), fVar2);
        int i92 = eVarE.e;
        int i96 = eVarE.d;
        int[] iArr = bi.d.f15344a;
        int length3 = string.length();
        int i99 = eVarE.f15348b;
        int i100 = eVarE.f15349c;
        if (length3 != i99) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb9 = new StringBuilder(i99 + i100);
        sb9.append(string);
        int iC = eVarE.c();
        if (iC == 1) {
            sb9.append(bi.d.a(i100, string));
            i3 = 0;
        } else {
            sb9.setLength(sb9.capacity());
            int[] iArr2 = new int[iC];
            int[] iArr3 = new int[iC];
            int[] iArr4 = new int[iC];
            int i101 = 0;
            while (i101 < iC) {
                int i102 = i33;
                int i103 = i101 + 1;
                iArr2[i101] = eVarE.a(i103);
                iArr3[i101] = eVarE.f15351h;
                iArr4[i101] = i102;
                if (i101 > 0) {
                    iArr4[i101] = iArr4[i101 - 1] + iArr2[i101];
                }
                i101 = i103;
                i33 = i102;
            }
            i3 = i33;
            for (int i104 = i3; i104 < iC; i104++) {
                StringBuilder sb10 = new StringBuilder(iArr2[i104]);
                for (int i105 = i104; i105 < i99; i105 += iC) {
                    sb10.append(string.charAt(i105));
                }
                String strA = bi.d.a(iArr3[i104], sb10.toString());
                int i106 = i104;
                int i107 = i3;
                while (i106 < iArr3[i104] * iC) {
                    sb9.setCharAt(i99 + i106, strA.charAt(i107));
                    i106 += iC;
                    i107++;
                }
            }
        }
        String string2 = sb9.toString();
        int iB = eVarE.b() * i96;
        int iD = eVarE.d() * i92;
        v0 v0Var = new v0();
        v0Var.d = string2;
        v0Var.f13489b = iB;
        v0Var.f13488a = iD;
        ?? r06 = new byte[iB * iD];
        v0Var.f13490c = r06;
        Arrays.fill((byte[]) r06, (byte) -1);
        int i108 = v0Var.f13489b;
        byte[] bArr = (byte[]) v0Var.f13490c;
        int i109 = i3;
        int i110 = i109;
        int i111 = 4;
        while (true) {
            if (i111 == iD && i110 == 0) {
                int i112 = iD - 1;
                i5 = i108;
                v0Var.m(i112, i3, i109, 1);
                v0Var.m(i112, 1, i109, 2);
                v0Var.m(i112, 2, i109, 3);
                v0Var.m(0, iB - 2, i109, 4);
                int i113 = iB - 1;
                v0Var.m(0, i113, i109, 5);
                v0Var.m(1, i113, i109, 6);
                v0Var.m(2, i113, i109, 7);
                v0Var.m(3, i113, i109, 8);
                i109++;
            } else {
                i5 = i108;
            }
            int i114 = iD - 2;
            if (i111 == i114 && i110 == 0 && iB % 4 != 0) {
                eVar = eVarE;
                v0Var.m(iD - 3, 0, i109, 1);
                v0Var.m(i114, 0, i109, 2);
                v0Var.m(iD - 1, 0, i109, 3);
                v0Var.m(0, iB - 4, i109, 4);
                v0Var.m(0, iB - 3, i109, 5);
                v0Var.m(0, iB - 2, i109, 6);
                int i115 = iB - 1;
                v0Var.m(0, i115, i109, 7);
                v0Var.m(1, i115, i109, 8);
                i109++;
            } else {
                eVar = eVarE;
            }
            if (i111 == i114 && i110 == 0 && iB % 8 == 4) {
                v0Var.m(iD - 3, 0, i109, 1);
                v0Var.m(i114, 0, i109, 2);
                v0Var.m(iD - 1, 0, i109, 3);
                v0Var.m(0, iB - 2, i109, 4);
                int i116 = iB - 1;
                v0Var.m(0, i116, i109, 5);
                v0Var.m(1, i116, i109, 6);
                v0Var.m(2, i116, i109, 7);
                v0Var.m(3, i116, i109, 8);
                i109++;
            }
            if (i111 == iD + 4 && i110 == 2 && iB % 8 == 0) {
                int i117 = iD - 1;
                v0Var.m(i117, 0, i109, 1);
                int i118 = iB - 1;
                v0Var.m(i117, i118, i109, 2);
                int i119 = iB - 3;
                i6 = i114;
                v0Var.m(0, i119, i109, 3);
                int i120 = iB - 2;
                v0Var.m(0, i120, i109, 4);
                v0Var.m(0, i118, i109, 5);
                v0Var.m(1, i119, i109, 6);
                v0Var.m(1, i120, i109, 7);
                v0Var.m(1, i118, i109, 8);
                i109++;
            } else {
                i6 = i114;
            }
            while (true) {
                if (i111 < iD && i110 >= 0 && bArr[(i111 * i5) + i110] < 0) {
                    v0Var.x(i111, i110, i109);
                    i109++;
                }
                int i121 = i111 - 2;
                int i122 = i110 + 2;
                if (i121 < 0 || i122 >= iB) {
                    break;
                }
                i111 = i121;
                i110 = i122;
            }
            int i123 = i111 - 1;
            int i124 = i110 + 5;
            while (true) {
                if (i123 >= 0 && i124 < iB && bArr[(i123 * i5) + i124] < 0) {
                    v0Var.x(i123, i124, i109);
                    i109++;
                }
                int i125 = i123 + 2;
                int i126 = i124 - 2;
                if (i125 >= iD || i126 < 0) {
                    break;
                }
                i123 = i125;
                i124 = i126;
            }
            i111 = i123 + 5;
            i110 = i124 - 1;
            if (i111 >= iD && i110 >= iB) {
                break;
            }
            i3 = 0;
            i108 = i5;
            eVarE = eVar;
        }
        int i127 = iB - 1;
        int i128 = iD - 1;
        if (bArr[(i128 * i5) + i127] < 0) {
            int i129 = (i128 * i5) + i127;
            byte b4 = (byte) 1;
            bArr[i129] = b4;
            bArr[(i6 * i5) + (iB - 2)] = b4;
        }
        int iB2 = eVar.b() * i96;
        int iD2 = eVar.d() * i92;
        boolean z = true;
        es0.e eVar2 = new es0.e((eVar.b() * i96) + (eVar.b() << 1), (eVar.d() * i92) + (eVar.d() << 1));
        int i130 = 0;
        int i131 = 0;
        while (i131 < iD2) {
            int i132 = i131 % i92;
            if (i132 == 0) {
                int i133 = 0;
                int i134 = 0;
                while (i133 < (eVar.b() * i96) + (eVar.b() << 1)) {
                    eVar2.c(i134, i130, i133 % 2 == 0 ? z : false);
                    i134++;
                    i133++;
                    z = true;
                }
                i130++;
            }
            int i135 = 0;
            for (int i136 = 0; i136 < iB2; i136++) {
                int i137 = i136 % i96;
                if (i137 == 0) {
                    eVar2.c(i135, i130, true);
                    i135++;
                }
                eVar2.c(i135, i130, bArr[(i131 * i5) + i136] == 1);
                int i138 = i135 + 1;
                if (i137 == i96 - 1) {
                    eVar2.c(i138, i130, i131 % 2 == 0);
                    i135 += 2;
                } else {
                    i135 = i138;
                }
            }
            int i139 = i130 + 1;
            if (i132 == i92 - 1) {
                int i140 = 0;
                for (int i141 = 0; i141 < (eVar.b() * i96) + (eVar.b() << 1); i141++) {
                    eVar2.c(i140, i139, true);
                    i140++;
                }
                i130 += 2;
            } else {
                i130 = i139;
            }
            i131++;
            z = true;
        }
        int i142 = eVar2.f128826b;
        int i143 = eVar2.f128827c;
        int iMax = Math.max(i, i142);
        int iMax2 = Math.max(i2, i143);
        int iMin = Math.min(iMax / i142, iMax2 / i143);
        int i144 = (iMax - (i142 * iMin)) / 2;
        int i145 = (iMax2 - (i143 * iMin)) / 2;
        if (i2 < i143 || i < i142) {
            bVar = new yh.b(i142, i143);
            i21 = 0;
            i22 = 0;
        } else {
            bVar = new yh.b(i, i2);
            i21 = i144;
            i22 = i145;
        }
        int[] iArr5 = bVar.d;
        int length4 = iArr5.length;
        for (int i146 = 0; i146 < length4; i146++) {
            iArr5[i146] = 0;
        }
        int i147 = i22;
        int i148 = 0;
        while (i148 < i143) {
            int i149 = i21;
            int i150 = 0;
            while (i150 < i142) {
                if (eVar2.a(i150, i148) == 1) {
                    bVar.c(i149, i147, iMin, iMin);
                }
                i150++;
                i149 += iMin;
            }
            i148++;
            i147 += iMin;
        }
        return bVar;
    }

    @Override // f8.a
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // z8.a
    public Object create() {
        try {
            return new g8.g(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // f8.a
    public void d(int i) {
    }

    @Override // f8.a
    public void e() {
    }

    @Override // f8.a
    public Bitmap f(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public void g(c cVar) {
        StringBuilder sb6 = new StringBuilder();
        while (true) {
            if (!cVar.b()) {
                break;
            }
            char cA = cVar.a();
            cVar.d++;
            int iJ = j(cA, sb6);
            int length = cVar.f15342c.length() + ((sb6.length() / 3) << 1);
            cVar.c(length);
            int i = cVar.f.f15348b - length;
            if (!cVar.b()) {
                StringBuilder sb9 = new StringBuilder();
                if (sb6.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length2 = sb6.length();
                    sb6.delete(length2 - iJ, length2);
                    cVar.d--;
                    iJ = j(cVar.a(), sb9);
                    cVar.f = null;
                }
                while (sb6.length() % 3 == 1 && ((iJ <= 3 && i != 1) || iJ > 3)) {
                    int length3 = sb6.length();
                    sb6.delete(length3 - iJ, length3);
                    cVar.d--;
                    iJ = j(cVar.a(), sb9);
                    cVar.f = null;
                }
            } else if (sb6.length() % 3 == 0 && ksj.b.t(cVar.f15340a, cVar.d, k()) != k()) {
                cVar.e = 0;
                break;
            }
        }
        m(cVar, sb6);
    }

    public TextLocalisedClause h(Links links, r1 parcelWrapStrategy) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(parcelWrapStrategy, "parcelWrapStrategy");
        return new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_text, v.k(o(R$string.wealth_footer_disclosure_securities_eea_car_link, links, parcelWrapStrategy), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_stock_trading_disclosures_link, null, new Click(28, (Integer) null, aah.b.a(m1.f318535a, parcelWrapStrategy), "SECURITIES_DISCLOSURES", false), 10)), null, 12);
    }

    public TextLocalisedClause i(Links links, r1 parcelWrapStrategy) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(parcelWrapStrategy, "parcelWrapStrategy");
        return new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_bond_car_text, v.k(o(R$string.wealth_footer_disclosure_securities_gb_car_link, links, parcelWrapStrategy), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_trading_disclosures_link, null, new Click(28, (Integer) null, aah.b.a(k1.f318523a, parcelWrapStrategy), "INVEST_DISCLOSURES", false), 10)), null, 12);
    }

    public int j(char c2, StringBuilder sb6) {
        if (c2 == ' ') {
            sb6.append((char) 3);
            return 1;
        }
        if (c2 >= '0' && c2 <= '9') {
            sb6.append((char) (c2 - ','));
            return 1;
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            sb6.append((char) (c2 - '3'));
            return 1;
        }
        if (c2 < ' ') {
            sb6.append((char) 0);
            sb6.append(c2);
            return 2;
        }
        if (c2 >= '!' && c2 <= '/') {
            sb6.append((char) 1);
            sb6.append((char) (c2 - '!'));
            return 2;
        }
        if (c2 >= ':' && c2 <= '@') {
            sb6.append((char) 1);
            sb6.append((char) (c2 - '+'));
            return 2;
        }
        if (c2 >= '[' && c2 <= '_') {
            sb6.append((char) 1);
            sb6.append((char) (c2 - 'E'));
            return 2;
        }
        if (c2 < '`' || c2 > 127) {
            sb6.append("\u0001\u001e");
            return j((char) (c2 - 128), sb6) + 2;
        }
        sb6.append((char) 2);
        sb6.append((char) (c2 - '`'));
        return 2;
    }

    public int k() {
        return 1;
    }

    @Override // ck.a
    public ak.a l(Future future, mj.a aVar) {
        return new r10.a(future, aVar);
    }

    public void m(c cVar, StringBuilder sb6) {
        int length = (sb6.length() / 3) << 1;
        int length2 = sb6.length() % 3;
        int length3 = cVar.f15342c.length() + length;
        cVar.c(length3);
        int i = cVar.f.f15348b - length3;
        if (length2 == 2) {
            sb6.append((char) 0);
            while (sb6.length() >= 3) {
                s(cVar, sb6);
            }
            if (cVar.b()) {
                cVar.d((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb6.length() >= 3) {
                s(cVar, sb6);
            }
            if (cVar.b()) {
                cVar.d((char) 254);
            }
            cVar.d--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb6.length() >= 3) {
                s(cVar, sb6);
            }
            if (i > 0 || cVar.b()) {
                cVar.d((char) 254);
            }
        }
        cVar.e = 0;
    }

    public void n(Rect bounds, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(bounds, "rect");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        float f = i3;
        float f4 = i5;
        float f5 = f / f4;
        float f6 = i;
        float f32 = i2;
        if (f6 / f32 > f5) {
            bounds.offset(-(((int) (f6 - (f5 * f32))) / 2), 0);
            float f35 = f4 / f32;
            bounds.set((int) (bounds.left * f35), (int) (bounds.top * f35), (int) (bounds.right * f35), (int) (bounds.bottom * f35));
        } else {
            bounds.offset(0, -(((int) (f32 - (f6 / f5))) / 2));
            float f36 = f / f6;
            bounds.set((int) (bounds.left * f36), (int) (bounds.top * f36), (int) (bounds.right * f36), (int) (bounds.bottom * f36));
        }
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int i6 = bounds.left;
        bounds.left = i3 - bounds.right;
        bounds.right = i3 - i6;
    }

    public TextLocalisedClause o(int i, Links links, r1 r1Var) {
        return new TextLocalisedClause(i, null, new Click(28, (Integer) null, aah.b.a(new n1(links.d), r1Var), "SECURITIES_CAR", false), 10);
    }

    public l p(lr6.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        q.Companion.getClass();
        TextLocalisedClause textLocalisedClauseB = q.f.contains(state) ? wu6.b.b(state) : null;
        if (textLocalisedClauseB != null) {
            return new l(textLocalisedClauseB, state, state.name());
        }
        return null;
    }

    public l q(k filter) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(filter, "method");
        Intrinsics.checkNotNullParameter(filter, "filter");
        int i = wu6.a.f300071b[filter.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_kind_card, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_kind_revolut_pay, null, null, 14);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_kind_google_pay, null, null, 14);
        } else if (i == 4) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_kind_apple_pay, null, null, 14);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_kind_tap_to_pay, null, null, 14);
        }
        return new l(textLocalisedClause, filter, filter.name());
    }

    public gsb.l r(nel.v stateDetails, c3 c3Var) {
        String str;
        Intrinsics.checkNotNullParameter(stateDetails, "stateDetails");
        String str2 = stateDetails.f214629a;
        switch (str2.hashCode()) {
            case -2146824541:
                if (str2.equals("CLOSE_POSITIONS")) {
                    return h.f146358a;
                }
                return null;
            case -1827361180:
                str = "MARKET_HALT";
                break;
            case -755088226:
                str = "TRADEABLE";
                break;
            case 1124965819:
                if (!str2.equals("SUSPENDED")) {
                    return null;
                }
                g3h.a aVarA = m4h.d.a(stateDetails, c3Var);
                return aVarA != null ? new gsb.k(aVarA) : j.f146360a;
            case 1296747641:
                if (!str2.equals("SELL_ONLY")) {
                    return null;
                }
                g3h.a aVarA2 = m4h.d.a(stateDetails, c3Var);
                return aVarA2 != null ? new gsb.k(aVarA2) : i.f146359a;
            default:
                return null;
        }
        str2.equals(str);
        return null;
    }

    public String toString() {
        switch (this.f250156a) {
            case 22:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(boolean z) {
        this.f250156a = 11;
    }

    public a(o5c.a cryptoExchangeEligibilityInteractor, j5c.a navigationExtension) {
        this.f250156a = 29;
        Intrinsics.checkNotNullParameter(cryptoExchangeEligibilityInteractor, "cryptoExchangeEligibilityInteractor");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
    }

    public a(n toolbarMapper) {
        this.f250156a = 16;
        Intrinsics.checkNotNullParameter(toolbarMapper, "toolbarMapper");
    }

    public a(f7i.a errorItemMapper, f7i.e limitItemMapper) {
        this.f250156a = 5;
        Intrinsics.checkNotNullParameter(errorItemMapper, "errorItemMapper");
        Intrinsics.checkNotNullParameter(limitItemMapper, "limitItemMapper");
    }

    public a(kx.a centerCropProjector, kx.b mirrorHorizontalProjector) {
        this.f250156a = 24;
        Intrinsics.checkNotNullParameter(centerCropProjector, "centerCropProjector");
        Intrinsics.checkNotNullParameter(mirrorHorizontalProjector, "mirrorHorizontalProjector");
    }

    public a(t0 travelHotelsRepository) {
        this.f250156a = 17;
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
    }

    public a(m4h.d instrumentWarningStateMatcher) {
        this.f250156a = 14;
        Intrinsics.checkNotNullParameter(instrumentWarningStateMatcher, "instrumentWarningStateMatcher");
    }

    public a(z58.c revPointsEarningRatesExtension) {
        this.f250156a = 7;
        Intrinsics.checkNotNullParameter(revPointsEarningRatesExtension, "revPointsEarningRatesExtension");
    }

    public a(qmc.d portfolioBalanceProvider, gte.a featureToggleInteractor, x8h.k displayCurrencyInteractor, toh.d performanceParametersInteractor) {
        this.f250156a = 18;
        Intrinsics.checkNotNullParameter(portfolioBalanceProvider, "portfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(performanceParametersInteractor, "performanceParametersInteractor");
    }

    public a(wu6.b paymentClauseFactory) {
        this.f250156a = 2;
        Intrinsics.checkNotNullParameter(paymentClauseFactory, "paymentClauseFactory");
    }

    public a(m freelancerPocketsInteractor, ppk.f ratesInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, wsg.n walletInteractor) {
        this.f250156a = 15;
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
    }

    public a(aah.b parcelWrapper) {
        this.f250156a = 3;
        Intrinsics.checkNotNullParameter(parcelWrapper, "parcelWrapper");
    }

    public a(q89.e onboardingInteractor) {
        this.f250156a = 6;
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
    }

    public a(gud.b buyDestinationProvider) {
        this.f250156a = 9;
        Intrinsics.checkNotNullParameter(buyDestinationProvider, "buyDestinationProvider");
    }

    public a(zvk.b assetStatsGroupMapper) {
        this.f250156a = 28;
        Intrinsics.checkNotNullParameter(assetStatsGroupMapper, "assetStatsGroupMapper");
    }

    public a(ehe.c cVar) {
        this.f250156a = 10;
    }
}
