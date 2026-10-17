package im;

import cam.f;
import ch.qos.logback.core.CoreConstants;
import com.redmadrobot.inputmask.helper.Compiler$FormatError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import km.e;
import km.g;
import km.h;
import km.i;
import km.j;
import km.k;
import km.l;
import km.m;
import km.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f162274c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f162275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f162276b;

    public c(String format, List customNotations) throws Compiler$FormatError {
        Iterator it8;
        a aVar;
        boolean z;
        Intrinsics.j(format, "format");
        Intrinsics.j(customNotations, "customNotations");
        this.f162276b = customNotations;
        a aVar2 = new a(customNotations, 0);
        char[] charArray = format.toCharArray();
        Intrinsics.g(charArray, "(this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        while (true) {
            char c2 = CoreConstants.CURLY_LEFT;
            if (i >= length) {
                ArrayList arrayList = new ArrayList();
                char[] charArray2 = format.toCharArray();
                Intrinsics.g(charArray2, "(this as java.lang.String).toCharArray()");
                int length2 = charArray2.length;
                String str = "";
                int i2 = 0;
                boolean z11 = false;
                while (i2 < length2) {
                    char c3 = charArray2[i2];
                    if ('\\' != c3 || z11) {
                        if (('[' == c3 || c2 == c3) && !z11) {
                            if (str.length() > 0) {
                                arrayList.add(str);
                            }
                            str = "";
                        }
                        str = str + c3;
                        if ((']' == c3 || '}' == c3) && !z11) {
                            arrayList.add(str);
                            str = "";
                        }
                        z11 = false;
                    } else {
                        str = str + c3;
                        z11 = true;
                    }
                    i2++;
                    c2 = CoreConstants.CURLY_LEFT;
                }
                if (str.length() != 0) {
                    arrayList.add(str);
                }
                ArrayList<String> arrayList2 = new ArrayList();
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    String str2 = (String) it9.next();
                    if (a0.H(str2, "[", false)) {
                        int length3 = str2.length();
                        it8 = it9;
                        String str3 = "";
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length3) {
                                aVar = aVar2;
                                break;
                            }
                            int i5 = length3;
                            char cCharAt = str2.charAt(i3);
                            int i6 = i3;
                            if (cCharAt == '[') {
                                str3 = str3 + cCharAt;
                                aVar = aVar2;
                            } else {
                                if (cCharAt == ']') {
                                    aVar = aVar2;
                                    if (!a0.y(str3, "\\", false)) {
                                        arrayList2.add(str3 + cCharAt);
                                        break;
                                    }
                                } else {
                                    aVar = aVar2;
                                }
                                if (cCharAt == '0' || cCharAt == '9') {
                                    z = false;
                                    if (d0.J(str3, "A", false) || d0.J(str3, "a", false) || d0.J(str3, "-", false) || d0.J(str3, "_", false)) {
                                        arrayList2.add(str3.concat("]"));
                                        str3 = "[" + cCharAt;
                                    }
                                } else {
                                    z = false;
                                }
                                if ((cCharAt == 'A' || cCharAt == 'a') && (d0.J(str3, "0", z) || d0.J(str3, "9", z) || d0.J(str3, "-", z) || d0.J(str3, "_", z))) {
                                    arrayList2.add(str3.concat("]"));
                                    str3 = "[" + cCharAt;
                                } else if ((cCharAt == '-' || cCharAt == '_') && (d0.J(str3, "0", z) || d0.J(str3, "9", z) || d0.J(str3, "A", z) || d0.J(str3, "a", z))) {
                                    arrayList2.add(str3.concat("]"));
                                    str3 = "[" + cCharAt;
                                } else {
                                    str3 = str3 + cCharAt;
                                }
                            }
                            i3 = i6 + 1;
                            length3 = i5;
                            aVar2 = aVar;
                        }
                    } else {
                        it8 = it9;
                        aVar = aVar2;
                        arrayList2.add(str2);
                    }
                    it9 = it8;
                    aVar2 = aVar;
                }
                a aVar3 = aVar2;
                ArrayList arrayList3 = new ArrayList();
                for (String strI : arrayList2) {
                    if (a0.H(strI, "[", false)) {
                        if (d0.J(strI, "0", false) || d0.J(strI, "9", false)) {
                            StringBuilder sb6 = new StringBuilder("[");
                            String strD = a0.D(a0.D(strI, "[", "", false), "]", "", false);
                            if (strD == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                            char[] charArray3 = strD.toCharArray();
                            Intrinsics.g(charArray3, "(this as java.lang.String).toCharArray()");
                            strI = v0.a.i(sb6, zhm.d0.k0(d.m0(charArray3), "", null, null, 0, null, 62), "]");
                        } else if (d0.J(strI, "a", false) || d0.J(strI, "A", false)) {
                            StringBuilder sb9 = new StringBuilder("[");
                            String strD2 = a0.D(a0.D(strI, "[", "", false), "]", "", false);
                            if (strD2 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                            char[] charArray4 = strD2.toCharArray();
                            Intrinsics.g(charArray4, "(this as java.lang.String).toCharArray()");
                            strI = v0.a.i(sb9, zhm.d0.k0(d.m0(charArray4), "", null, null, 0, null, 62), "]");
                        } else {
                            StringBuilder sb10 = new StringBuilder("[");
                            String strD3 = a0.D(a0.D(a0.D(a0.D(strI, "[", "", false), "]", "", false), "_", "A", false), "-", "a", false);
                            if (strD3 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                            char[] charArray5 = strD3.toCharArray();
                            Intrinsics.g(charArray5, "(this as java.lang.String).toCharArray()");
                            strI = a0.D(a0.D(v0.a.i(sb10, zhm.d0.k0(d.m0(charArray5), "", null, null, 0, null, 62), "]"), "A", "_", false), "a", "-", false);
                        }
                    }
                    arrayList3.add(strI);
                }
                this.f162275a = aVar3.a(zhm.d0.k0(arrayList3, "", null, null, 0, null, 62), false, false, null);
                return;
            }
            char c5 = charArray[i];
            if ('\\' == c5) {
                z3 = !z3;
            } else {
                if ('[' == c5) {
                    if (z4) {
                        throw new Compiler$FormatError();
                    }
                    z4 = !z3;
                }
                if (']' == c5 && !z3) {
                    z4 = false;
                }
                if ('{' == c5) {
                    if (z6) {
                        throw new Compiler$FormatError();
                    }
                    z6 = !z3;
                }
                if ('}' == c5 && !z3) {
                    z6 = false;
                }
                z3 = false;
            }
            i++;
        }
    }

    public static String a(f fVar, String str) {
        if (fVar != null) {
            f fVar2 = (f) fVar.f22677a;
            if (fVar instanceof km.a) {
                return str;
            }
            if (fVar instanceof km.b) {
                StringBuilder sbS = p.a.s(str);
                sbS.append(((km.b) fVar).f185657b);
                return a(fVar2, sbS.toString());
            }
            if (fVar instanceof km.c) {
                StringBuilder sbS2 = p.a.s(str);
                sbS2.append(((km.c) fVar).f185658b);
                return a(fVar2, sbS2.toString());
            }
            if (fVar instanceof h) {
                g4i.a aVar = ((h) fVar).f185661b;
                if (aVar instanceof km.d) {
                    return a(fVar2, str + "-");
                }
                if (aVar instanceof km.f) {
                    return a(fVar2, str + "a");
                }
                if (aVar instanceof g) {
                    return a(fVar2, str + "0");
                }
                if (!(aVar instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                StringBuilder sbS3 = p.a.s(str);
                sbS3.append(((e) aVar).f185659a);
                return a(fVar2, sbS3.toString());
            }
            if (fVar instanceof n) {
                gc0.c cVar = ((n) fVar).f185665b;
                if (cVar instanceof i) {
                    return a(fVar2, str + "-");
                }
                if (cVar instanceof l) {
                    return a(fVar2, str + "a");
                }
                if (cVar instanceof m) {
                    return a(fVar2, str + "0");
                }
                if (!(cVar instanceof k)) {
                    if (!(cVar instanceof j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StringBuilder sbS4 = p.a.s(str);
                    sbS4.append(((j) cVar).f185662a);
                    return a(fVar2, sbS4.toString());
                }
            }
        }
        return str;
    }

    public static boolean c(f fVar) {
        if (fVar instanceof km.a) {
            return true;
        }
        if (fVar instanceof n) {
            return ((n) fVar).f185665b instanceof k;
        }
        if ((fVar instanceof km.b) || (fVar instanceof km.c)) {
            return false;
        }
        return c(fVar.u());
    }

    public final b b(jm.a aVar, boolean z) {
        a80.e eVar = new a80.e(aVar);
        int i = aVar.f175890a;
        boolean zC = eVar.c();
        Character chM = eVar.m();
        f fVar = this.f162275a;
        String string = "";
        String string2 = string;
        while (chM != null) {
            jji.e eVarB = fVar.b(chM.charValue());
            if (eVarB != null) {
                Character ch5 = (Character) eVarB.f174964c;
                f fVar2 = (f) eVarB.f174963b;
                StringBuilder sbS = p.a.s(string);
                sbS.append(ch5 != null ? ch5 : "");
                string = sbS.toString();
                StringBuilder sbS2 = p.a.s(string2);
                Object obj2 = (Character) eVarB.d;
                if (obj2 == null) {
                    obj2 = "";
                }
                sbS2.append(obj2);
                string2 = sbS2.toString();
                if (eVarB.f174962a) {
                    zC = eVar.c();
                    chM = eVar.m();
                } else if (zC && ch5 != null) {
                    i++;
                }
                fVar = fVar2;
            } else {
                if (eVar.c()) {
                    i--;
                }
                zC = eVar.c();
                chM = eVar.m();
            }
        }
        while (z && zC) {
            jji.e eVarC = fVar.c();
            if (eVarC == null) {
                break;
            }
            Character ch9 = (Character) eVarC.f174964c;
            fVar = (f) eVarC.f174963b;
            StringBuilder sbS3 = p.a.s(string);
            sbS3.append(ch9 != null ? ch9 : "");
            string = sbS3.toString();
            StringBuilder sbS4 = p.a.s(string2);
            Object obj3 = (Character) eVarC.d;
            if (obj3 == null) {
                obj3 = "";
            }
            sbS4.append(obj3);
            string2 = sbS4.toString();
            if (ch9 != null) {
                i++;
            }
        }
        return new b(new jm.a(string, i), string2, c(fVar));
    }
}
