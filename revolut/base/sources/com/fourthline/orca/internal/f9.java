package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.internal.e9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
public class f9 extends e81 {
    static final Pattern e = Pattern.compile("(?s)/\\*.*?\\*/");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28381a;

        static {
            int[] iArr = new int[e9.i.values().length];
            f28381a = iArr;
            try {
                iArr[e9.i.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28381a[e9.i.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28381a[e9.i.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28381a[e9.i.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28381a[e9.i.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28381a[e9.i.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28381a[e9.i.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28381a[e9.i.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28381a[e9.i.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28381a[e9.i.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28381a[e9.i.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28381a[e9.i.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28381a[e9.i.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28381a[e9.i.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28381a[e9.i.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28381a[e9.i.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28381a[e9.i.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28381a[e9.i.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f28381a[e9.i.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f28381a[e9.i.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f28381a[e9.i.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f28381a[e9.i.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f28381a[e9.i.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f28381a[e9.i.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28383b;

        public b(int i, int i2) {
            this.f28382a = i;
            this.f28383b = i2;
        }
    }

    public f9(String str) {
        super(e.matcher(str).replaceAll(""));
    }

    private int B() {
        int i;
        if (c()) {
            return this.f28019b;
        }
        int i2 = this.f28019b;
        int iCharAt = this.f28018a.charAt(i2);
        if (iCharAt == 45) {
            iCharAt = a();
        }
        if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 45 && iCharAt != 95 && iCharAt < 128)) {
            i = i2;
        } else {
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && ((iA < 48 || iA > 57) && iA != 45 && iA != 95 && iA < 128))) {
                    break;
                }
                iA = a();
            }
            i = this.f28019b;
        }
        this.f28019b = i2;
        return i;
    }

    private int c(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    private b r() {
        d30 d30VarA;
        b bVar;
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        if (!a(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
            return null;
        }
        q();
        int i2 = 1;
        if (a("odd")) {
            bVar = new b(2, 1);
        } else {
            if (a("even")) {
                bVar = new b(2, 0);
            } else {
                int i3 = (!a('+') && a(CoreConstants.DASH_CHAR)) ? -1 : 1;
                d30 d30VarA2 = d30.a(this.f28018a, this.f28019b, this.f28020c, false);
                if (d30VarA2 != null) {
                    this.f28019b = d30VarA2.a();
                }
                if (a('n') || a('N')) {
                    if (d30VarA2 == null) {
                        d30VarA2 = new d30(1L, this.f28019b);
                    }
                    q();
                    boolean zA = a('+');
                    if (!zA && (zA = a(CoreConstants.DASH_CHAR))) {
                        i2 = -1;
                    }
                    if (zA) {
                        q();
                        d30VarA = d30.a(this.f28018a, this.f28019b, this.f28020c, false);
                        if (d30VarA == null) {
                            this.f28019b = i;
                            return null;
                        }
                        this.f28019b = d30VarA.a();
                        int i5 = i2;
                        i2 = i3;
                        i3 = i5;
                    } else {
                        int i6 = i2;
                        i2 = i3;
                        i3 = i6;
                        d30VarA = null;
                    }
                } else {
                    d30VarA = d30VarA2;
                    d30VarA2 = null;
                }
                bVar = new b(d30VarA2 == null ? 0 : i2 * d30VarA2.b(), d30VarA != null ? i3 * d30VarA.b() : 0);
            }
        }
        q();
        if (a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            return bVar;
        }
        this.f28019b = i;
        return null;
    }

    private String s() {
        if (c()) {
            return null;
        }
        String strJ = j();
        return strJ != null ? strJ : v();
    }

    private List u() {
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        if (!a(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
            return null;
        }
        q();
        ArrayList arrayList = null;
        do {
            String strV = v();
            if (strV == null) {
                this.f28019b = i;
                return null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strV);
            q();
        } while (p());
        if (a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            return arrayList;
        }
        this.f28019b = i;
        return null;
    }

    private List y() {
        List list;
        List list2;
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        if (!a(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
            return null;
        }
        q();
        List listZ = z();
        if (listZ == null) {
            this.f28019b = i;
            return null;
        }
        if (!a(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
            this.f28019b = i;
            return null;
        }
        Iterator it8 = listZ.iterator();
        while (it8.hasNext() && (list = ((e9.r) it8.next()).f28070a) != null) {
            Iterator it9 = list.iterator();
            while (it9.hasNext() && (list2 = ((e9.s) it9.next()).d) != null) {
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    if (((e9.f) it10.next()) instanceof e9.j) {
                        return null;
                    }
                }
            }
        }
        return listZ;
    }

    public String A() {
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        if (!a("url(")) {
            return null;
        }
        q();
        String strT = t();
        if (strT == null) {
            strT = w();
        }
        if (strT == null) {
            this.f28019b = i;
            return null;
        }
        q();
        if (c() || a(")")) {
            return strT;
        }
        this.f28019b = i;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.fourthline.orca.internal.e9.r r11) throws com.fourthline.orca.internal.d9 {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.f9.a(com.fourthline.orca.internal.e9$r):boolean");
    }

    public String t() {
        int iC;
        if (c()) {
            return null;
        }
        char cCharAt = this.f28018a.charAt(this.f28019b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb6 = new StringBuilder();
        this.f28019b++;
        int iIntValue = e().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = e().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = e().intValue();
                    } else {
                        int iC2 = c(iIntValue);
                        if (iC2 != -1) {
                            for (int i = 1; i <= 5 && (iC = c((iIntValue = e().intValue()))) != -1; i++) {
                                iC2 = (iC2 * 16) + iC;
                            }
                            sb6.append((char) iC2);
                        }
                    }
                }
            }
            sb6.append((char) iIntValue);
            iIntValue = e().intValue();
        }
        return sb6.toString();
    }

    public String v() {
        int iB = B();
        int i = this.f28019b;
        if (iB == i) {
            return null;
        }
        String strSubstring = this.f28018a.substring(i, iB);
        this.f28019b = iB;
        return strSubstring;
    }

    public String w() {
        char cCharAt;
        int iC;
        StringBuilder sb6 = new StringBuilder();
        while (!c() && (cCharAt = this.f28018a.charAt(this.f28019b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !b((int) cCharAt) && !Character.isISOControl((int) cCharAt)) {
            this.f28019b++;
            if (cCharAt == '\\') {
                if (!c()) {
                    String str = this.f28018a;
                    int i = this.f28019b;
                    this.f28019b = i + 1;
                    cCharAt = str.charAt(i);
                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                        int iC2 = c((int) cCharAt);
                        if (iC2 != -1) {
                            for (int i2 = 1; i2 <= 5 && !c() && (iC = c((int) this.f28018a.charAt(this.f28019b))) != -1; i2++) {
                                this.f28019b++;
                                iC2 = (iC2 * 16) + iC;
                            }
                            sb6.append((char) iC2);
                        }
                    }
                }
            }
            sb6.append(cCharAt);
        }
        if (sb6.length() == 0) {
            return null;
        }
        return sb6.toString();
    }

    public String x() {
        if (c()) {
            return null;
        }
        int i = this.f28019b;
        int iCharAt = this.f28018a.charAt(i);
        int i2 = i;
        while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !a(iCharAt)) {
            if (!b(iCharAt)) {
                i2 = this.f28019b + 1;
            }
            iCharAt = a();
        }
        if (this.f28019b > i) {
            return this.f28018a.substring(i, i2);
        }
        this.f28019b = i;
        return null;
    }

    public List z() {
        if (c()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        e9.r rVar = new e9.r();
        while (!c() && a(rVar)) {
            if (p()) {
                arrayList.add(rVar);
                rVar = new e9.r();
            }
        }
        if (!rVar.d()) {
            arrayList.add(rVar);
        }
        return arrayList;
    }

    private void a(e9.r rVar, e9.s sVar) throws d9 {
        e9.f gVar;
        e9.f fVar;
        e9.f fVar2;
        String strV = v();
        if (strV != null) {
            e9.i iVarA = e9.i.a(strV);
            switch (a.f28381a[iVarA.ordinal()]) {
                case 1:
                    e9.f gVar2 = new e9.g(0, 1, true, false, null);
                    rVar.a();
                    fVar2 = gVar2;
                    fVar = fVar2;
                    sVar.a(fVar);
                    return;
                case 2:
                    gVar = new e9.g(0, 1, false, false, null);
                    rVar.a();
                    fVar = gVar;
                    sVar.a(fVar);
                    return;
                case 3:
                    e9.f lVar = new e9.l(false, null);
                    rVar.a();
                    fVar = lVar;
                    sVar.a(fVar);
                    return;
                case 4:
                    gVar = new e9.g(0, 1, true, true, sVar.f28073b);
                    rVar.a();
                    fVar = gVar;
                    sVar.a(fVar);
                    return;
                case 5:
                    e9.f gVar3 = new e9.g(0, 1, false, true, sVar.f28073b);
                    rVar.a();
                    fVar = gVar3;
                    sVar.a(fVar);
                    return;
                case 6:
                    e9.f lVar2 = new e9.l(true, sVar.f28073b);
                    rVar.a();
                    fVar = lVar2;
                    sVar.a(fVar);
                    return;
                case 7:
                    e9.f mVar = new e9.m();
                    rVar.a();
                    fVar = mVar;
                    sVar.a(fVar);
                    return;
                case 8:
                    e9.f hVar = new e9.h();
                    rVar.a();
                    fVar = hVar;
                    sVar.a(fVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z = iVarA == e9.i.nth_child || iVarA == e9.i.nth_of_type;
                    boolean z3 = iVarA == e9.i.nth_of_type || iVarA == e9.i.nth_last_of_type;
                    b bVarR = r();
                    if (bVarR != null) {
                        gVar = new e9.g(bVarR.f28382a, bVarR.f28383b, z, z3, sVar.f28073b);
                        rVar.a();
                        fVar = gVar;
                        sVar.a(fVar);
                        return;
                    }
                    throw new d9("Invalid or missing parameter section for pseudo class: ".concat(strV));
                case 13:
                    List listY = y();
                    if (listY != null) {
                        e9.j jVar = new e9.j(listY);
                        rVar.f28071b = jVar.a();
                        fVar2 = jVar;
                        fVar = fVar2;
                        sVar.a(fVar);
                        return;
                    }
                    throw new d9("Invalid or missing parameter section for pseudo class: ".concat(strV));
                case 14:
                    e9.f nVar = new e9.n();
                    rVar.a();
                    fVar = nVar;
                    sVar.a(fVar);
                    return;
                case 15:
                    u();
                    e9.f kVar = new e9.k(strV);
                    rVar.a();
                    fVar = kVar;
                    sVar.a(fVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    e9.f kVar2 = new e9.k(strV);
                    rVar.a();
                    fVar = kVar2;
                    sVar.a(fVar);
                    return;
                default:
                    throw new d9("Unsupported pseudo class: ".concat(strV));
            }
        }
        throw new d9("Invalid pseudo class");
    }
}
