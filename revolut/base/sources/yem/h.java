package yem;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.t;
import io.michaelrocks.libphonenumber.android.MissingMetadataException;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zsc.p;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f313054h;
    public static final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map f313055j;
    public static final Map k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map f313056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Map f313057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f313058n;
    public static final Pattern o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f313059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f313060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f313061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f313062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f313063t;
    public static final Pattern u;
    public static final Pattern v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f313064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f313065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f313066y;
    public static final Pattern z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.h f313067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f313068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qm.e f313069c = new qm.e(14);
    public final HashSet d = new HashSet(35);
    public final vc.j e = new vc.j(100);
    public final HashSet f = new HashSet(320);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f313070g = new HashSet();

    static {
        Character chValueOf = Character.valueOf(CoreConstants.DOT);
        Character chValueOf2 = Character.valueOf(p.SPACE_CHAR);
        Character chValueOf3 = Character.valueOf(CoreConstants.DASH_CHAR);
        f313054h = Logger.getLogger(h.class.getName());
        HashMap map = new HashMap();
        map.put(54, "9");
        i = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        k = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        f313056l = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        f313055j = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch5 : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch5.charValue())), ch5);
            map6.put(ch5, ch5);
        }
        map6.putAll(map2);
        map6.put(chValueOf3, chValueOf3);
        map6.put((char) 65293, chValueOf3);
        map6.put((char) 8208, chValueOf3);
        map6.put((char) 8209, chValueOf3);
        map6.put((char) 8210, chValueOf3);
        map6.put((char) 8211, chValueOf3);
        map6.put((char) 8212, chValueOf3);
        map6.put((char) 8213, chValueOf3);
        map6.put((char) 8722, chValueOf3);
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(chValueOf2, chValueOf2);
        map6.put((char) 12288, chValueOf2);
        map6.put((char) 8288, chValueOf2);
        map6.put(chValueOf, chValueOf);
        map6.put((char) 65294, chValueOf);
        f313057m = Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb6 = new StringBuilder();
        Map map7 = k;
        sb6.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb6.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb6.toString();
        f313058n = Pattern.compile("[+＋]+");
        o = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f313059p = Pattern.compile("(\\p{Nd})");
        f313060q = Pattern.compile("[+＋\\p{Nd}]");
        f313061r = Pattern.compile("[\\\\/] *x");
        f313062s = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f313063t = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strP = p.a.p("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strA = a(true);
        a(false);
        u = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strR = a0.d.r(string, "\\p{Nd}");
        v = Pattern.compile("^(" + j6.a.s("[", strR, "]+((\\-)*[", strR, "])*") + "\\.)*" + j6.a.s("[", string, "]+((\\-)*[", strR, "])*") + "\\.?$");
        StringBuilder sb9 = new StringBuilder("(?:");
        sb9.append(strA);
        sb9.append(")$");
        f313064w = Pattern.compile(sb9.toString(), 66);
        f313065x = Pattern.compile(strP + "(?:" + strA + ")?", 66);
        Pattern.compile("(\\D+)");
        f313066y = Pattern.compile("(\\$\\d)");
        z = Pattern.compile("\\(?\\$1\\)?");
    }

    public h(ao.h hVar, HashMap map) {
        this.f313067a = hVar;
        this.f313068b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f313070g.add((Integer) entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            f313054h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) map.get(1));
    }

    public static String a(boolean z3) {
        String strI = v0.a.i(p.a.t(";ext=" + c(20), "|", "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + c(20) + "#?", "|", "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + c(9) + "#?"), "|", "[- ]+" + c(6) + "#");
        if (!z3) {
            return strI;
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.p(strI, "|", "[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + c(15) + "#?", "|", "[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + c(9) + "#?");
    }

    public static h b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context could not be null.");
        }
        yf.c cVar = new yf.c(context.getAssets(), 2);
        afm.a aVar = new afm.a(cVar);
        return new h(new ao.h(aVar.f4667b, cVar, aVar.f4666a), m70.a.k());
    }

    public static String c(int i2) {
        return j6.a.l(i2, "(\\p{Nd}{1,", "})");
    }

    public static String i(o oVar) {
        StringBuilder sb6 = new StringBuilder();
        if (oVar.i() && oVar.d() > 0) {
            char[] cArr = new char[oVar.d()];
            Arrays.fill(cArr, '0');
            sb6.append(new String(cArr));
        }
        sb6.append(oVar.c());
        return sb6.toString();
    }

    public static m j(k kVar, f fVar) {
        switch (d.f313053c[fVar.ordinal()]) {
            case 1:
                return kVar.p();
            case 2:
                return kVar.s();
            case 3:
                return kVar.h();
            case 4:
            case 5:
                return kVar.b();
            case 6:
                return kVar.r();
            case 7:
                return kVar.v();
            case 8:
                return kVar.n();
            case 9:
                return kVar.m();
            case 10:
                return kVar.t();
            case 11:
                return kVar.u();
            default:
                return kVar.c();
        }
    }

    public static void q(StringBuilder sb6) {
        if (f313063t.matcher(sb6).matches()) {
            sb6.replace(0, sb6.length(), s(sb6, f313056l));
        } else {
            sb6.replace(0, sb6.length(), r(sb6));
        }
    }

    public static String r(CharSequence charSequence) {
        StringBuilder sb6 = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int iDigit = Character.digit(charSequence.charAt(i2), 10);
            if (iDigit != -1) {
                sb6.append(iDigit);
            }
        }
        return sb6.toString();
    }

    public static String s(CharSequence charSequence, Map map) {
        StringBuilder sb6 = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch5 = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i2))));
            if (ch5 != null) {
                sb6.append(ch5);
            }
        }
        return sb6.toString();
    }

    public static void u(int i2, e eVar, StringBuilder sb6) {
        int i3 = d.f313052b[eVar.ordinal()];
        if (i3 == 1) {
            sb6.insert(0, i2).insert(0, '+');
        } else if (i3 == 2) {
            sb6.insert(0, " ").insert(0, i2).insert(0, '+');
        } else {
            if (i3 != 3) {
                return;
            }
            sb6.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    public static g v(StringBuilder sb6, k kVar, f fVar) {
        m mVarJ = j(kVar, fVar);
        ArrayList arrayListD = mVarJ.d().isEmpty() ? kVar.c().d() : mVarJ.d();
        ArrayList arrayListE = mVarJ.e();
        if (fVar == f.FIXED_LINE_OR_MOBILE) {
            m mVarJ2 = j(kVar, f.FIXED_LINE);
            if (mVarJ2.c() == 1 && mVarJ2.b() == -1) {
                return v(sb6, kVar, f.MOBILE);
            }
            m mVarJ3 = j(kVar, f.MOBILE);
            if (mVarJ3.c() != 1 || mVarJ3.b() != -1) {
                ArrayList arrayList = new ArrayList(arrayListD);
                arrayList.addAll(mVarJ3.c() == 0 ? kVar.c().d() : mVarJ3.d());
                Collections.sort(arrayList);
                if (arrayListE.isEmpty()) {
                    arrayListE = mVarJ3.e();
                } else {
                    ArrayList arrayList2 = new ArrayList(arrayListE);
                    arrayList2.addAll(mVarJ3.e());
                    Collections.sort(arrayList2);
                    arrayListE = arrayList2;
                }
                arrayListD = arrayList;
            }
        }
        if (((Integer) arrayListD.get(0)).intValue() == -1) {
            return g.INVALID_LENGTH;
        }
        int length = sb6.length();
        if (arrayListE.contains(Integer.valueOf(length))) {
            return g.IS_POSSIBLE_LOCAL_ONLY;
        }
        int iIntValue = ((Integer) arrayListD.get(0)).intValue();
        return iIntValue == length ? g.IS_POSSIBLE : iIntValue > length ? g.TOO_SHORT : ((Integer) arrayListD.get(arrayListD.size() - 1)).intValue() < length ? g.TOO_LONG : arrayListD.subList(1, arrayListD.size()).contains(Integer.valueOf(length)) ? g.IS_POSSIBLE : g.INVALID_LENGTH;
    }

    public final int d(StringBuilder sb6, StringBuilder sb9) {
        if (sb6.length() != 0 && sb6.charAt(0) != '0') {
            int length = sb6.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int i3 = Integer.parseInt(sb6.substring(0, i2));
                if (this.f313068b.containsKey(Integer.valueOf(i3))) {
                    sb9.append(sb6.substring(i2));
                    return i3;
                }
            }
        }
        return 0;
    }

    public final String e(o oVar, e eVar) {
        vc.j jVar;
        i iVar;
        if (oVar.c() == 0) {
            String strE = oVar.e();
            if (strE.length() > 0 || !oVar.f()) {
                return strE;
            }
        }
        StringBuilder sb6 = new StringBuilder(20);
        sb6.setLength(0);
        int iA = oVar.a();
        String strI = i(oVar);
        e eVar2 = e.E164;
        if (eVar == eVar2) {
            sb6.append(strI);
            u(iA, eVar2, sb6);
        } else if (this.f313068b.containsKey(Integer.valueOf(iA))) {
            String strL = l(iA);
            k kVarG = "001".equals(strL) ? g(iA) : h(strL);
            Iterator it8 = ((kVarG.e().size() == 0 || eVar == e.NATIONAL) ? kVarG.l() : kVarG.e()).iterator();
            while (true) {
                boolean zHasNext = it8.hasNext();
                jVar = this.e;
                if (!zHasNext) {
                    iVar = null;
                    break;
                }
                iVar = (i) it8.next();
                int iB = iVar.b();
                if (iB == 0 || jVar.a(iVar.a(iB - 1)).matcher(strI).lookingAt()) {
                    if (jVar.a(iVar.d()).matcher(strI).matches()) {
                        break;
                    }
                }
            }
            if (iVar != null) {
                String format = iVar.getFormat();
                Matcher matcher = jVar.a(iVar.d()).matcher(strI);
                e eVar3 = e.NATIONAL;
                String strC = iVar.c();
                strI = (eVar != eVar3 || strC == null || strC.length() <= 0) ? matcher.replaceAll(format) : matcher.replaceAll(f313066y.matcher(format).replaceFirst(strC));
                if (eVar == e.RFC3966) {
                    Matcher matcher2 = o.matcher(strI);
                    if (matcher2.lookingAt()) {
                        strI = matcher2.replaceFirst("");
                    }
                    strI = matcher2.reset(strI).replaceAll("-");
                }
            }
            sb6.append(strI);
            if (oVar.h() && oVar.b().length() > 0) {
                if (eVar == e.RFC3966) {
                    sb6.append(";ext=");
                    sb6.append(oVar.b());
                } else if (kVarG.x()) {
                    sb6.append(kVarG.o());
                    sb6.append(oVar.b());
                } else {
                    sb6.append(" ext. ");
                    sb6.append(oVar.b());
                }
            }
            u(iA, eVar, sb6);
        } else {
            sb6.append(strI);
        }
        return sb6.toString();
    }

    public final int f(String str) {
        if (str != null && this.f.contains(str)) {
            k kVarH = h(str);
            if (kVarH != null) {
                return kVarH.a();
            }
            throw new IllegalArgumentException(j6.a.q("Invalid region code: ", str));
        }
        Level level = Level.WARNING;
        StringBuilder sb6 = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append(") provided.");
        f313054h.log(level, sb6.toString());
        return 0;
    }

    public final k g(int i2) {
        if (!this.f313070g.contains(Integer.valueOf(i2))) {
            return null;
        }
        ao.h hVar = this.f313067a;
        hVar.getClass();
        if (z92.f.q(i2)) {
            throw new IllegalArgumentException(a0.d.h(i2, " calling code belongs to a geo entity"));
        }
        cpi.g gVar = (cpi.g) ((ao.h) ((t) hVar.f7848c).i(((cfm.c) hVar.f7847b).a(Integer.valueOf(i2)))).f7847b;
        k kVar = (k) ((ConcurrentHashMap) gVar.f107954b).get(Integer.valueOf(i2));
        String strN = a0.d.n("Missing metadata for country code ", i2);
        if (kVar != null) {
            return kVar;
        }
        throw new MissingMetadataException(strN);
    }

    public final k h(String str) {
        if (str == null || !this.f.contains(str)) {
            return null;
        }
        ao.h hVar = this.f313067a;
        hVar.getClass();
        if (!z92.f.r(str)) {
            throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
        }
        k kVar = (k) ((ConcurrentHashMap) ((cpi.g) ((ao.h) ((t) hVar.f7848c).i(((cfm.c) hVar.f7847b).a(str))).f7848c).f107954b).get(str);
        String strConcat = "Missing metadata for region code ".concat(str);
        if (kVar != null) {
            return kVar;
        }
        throw new MissingMetadataException(strConcat);
    }

    public final f k(String str, k kVar) {
        if (!n(str, kVar.c())) {
            return f.UNKNOWN;
        }
        if (n(str, kVar.p())) {
            return f.PREMIUM_RATE;
        }
        if (n(str, kVar.s())) {
            return f.TOLL_FREE;
        }
        if (n(str, kVar.r())) {
            return f.SHARED_COST;
        }
        if (n(str, kVar.v())) {
            return f.VOIP;
        }
        if (n(str, kVar.n())) {
            return f.PERSONAL_NUMBER;
        }
        if (n(str, kVar.m())) {
            return f.PAGER;
        }
        if (n(str, kVar.t())) {
            return f.UAN;
        }
        if (n(str, kVar.u())) {
            return f.VOICEMAIL;
        }
        if (!n(str, kVar.b())) {
            return (kVar.q() || !n(str, kVar.h())) ? f.UNKNOWN : f.MOBILE;
        }
        if (!kVar.q() && !n(str, kVar.h())) {
            return f.FIXED_LINE;
        }
        return f.FIXED_LINE_OR_MOBILE;
    }

    public final String l(int i2) {
        List list = (List) this.f313068b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final String m(o oVar) {
        int iA = oVar.a();
        List<String> list = (List) this.f313068b.get(Integer.valueOf(iA));
        if (list == null) {
            f313054h.log(Level.INFO, "Missing/invalid country_code (" + iA + ")");
            return null;
        }
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        String strI = i(oVar);
        for (String str : list) {
            k kVarH = h(str);
            if (kVarH.w()) {
                if (this.e.a(kVarH.f()).matcher(strI).lookingAt()) {
                    return str;
                }
            } else if (k(strI, kVarH) != f.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    public final boolean n(String str, m mVar) {
        int length = str.length();
        ArrayList arrayListD = mVar.d();
        if (arrayListD.size() <= 0 || arrayListD.contains(Integer.valueOf(length))) {
            return this.f313069c.e(str, mVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(java.lang.CharSequence r7, yem.k r8, java.lang.StringBuilder r9, yem.o r10) throws io.michaelrocks.libphonenumber.android.NumberParseException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yem.h.o(java.lang.CharSequence, yem.k, java.lang.StringBuilder, yem.o):int");
    }

    public final void p(StringBuilder sb6, k kVar, StringBuilder sb9) {
        int length = sb6.length();
        String strI = kVar.i();
        if (length == 0 || strI.length() == 0) {
            return;
        }
        Matcher matcher = this.e.a(strI).matcher(sb6);
        if (matcher.lookingAt()) {
            m mVarC = kVar.c();
            qm.e eVar = this.f313069c;
            boolean zE = eVar.e(sb6, mVarC);
            int iGroupCount = matcher.groupCount();
            String strK = kVar.k();
            if (strK == null || strK.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zE || eVar.e(sb6.substring(matcher.end()), mVarC)) {
                    if (sb9 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb9.append(matcher.group(1));
                    }
                    sb6.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb10 = new StringBuilder(sb6);
            sb10.replace(0, length, matcher.replaceFirst(strK));
            if (!zE || eVar.e(sb10.toString(), mVarC)) {
                if (sb9 != null && iGroupCount > 1) {
                    sb9.append(matcher.group(1));
                }
                sb6.replace(0, sb6.length(), sb10.toString());
            }
        }
    }

    public final o t(String str, String str2) throws NumberParseException {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iO;
        o oVar = new o();
        if (str == null) {
            throw new NumberParseException(c.NOT_A_NUMBER, "The phone number supplied was null.");
        }
        if (str.length() > 250) {
            throw new NumberParseException(c.TOO_LONG, "The string supplied was too long to parse.");
        }
        StringBuilder sb6 = new StringBuilder();
        String string = str.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        String strGroup = "";
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i2 = iIndexOf + 15;
            if (i2 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i2);
                strSubstring = iIndexOf2 != -1 ? string.substring(i2, iIndexOf2) : string.substring(i2);
            }
        }
        if (strSubstring != null && (strSubstring.length() == 0 || !(u.matcher(strSubstring).matches() || v.matcher(strSubstring).matches()))) {
            throw new NumberParseException(c.NOT_A_NUMBER, "The phone-context value is invalid.");
        }
        if (strSubstring != null) {
            if (strSubstring.charAt(0) == '+') {
                sb6.append(strSubstring);
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb6.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = f313060q.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = f313062s.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = f313061r.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb6.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb6.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb6.delete(iIndexOf4, sb6.length());
        }
        int length = sb6.length();
        Pattern pattern = f313065x;
        if (!(length < 2 ? false : pattern.matcher(sb6).matches())) {
            throw new NumberParseException(c.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
        }
        boolean z3 = str2 != null && this.f.contains(str2);
        Pattern pattern2 = f313058n;
        if (!z3 && (sb6.length() == 0 || !pattern2.matcher(sb6).lookingAt())) {
            throw new NumberParseException(c.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
        }
        Matcher matcher4 = f313064w.matcher(sb6);
        if (matcher4.find()) {
            String strSubstring2 = sb6.substring(0, matcher4.start());
            if (strSubstring2.length() < 2 ? false : pattern.matcher(strSubstring2).matches()) {
                int iGroupCount = matcher4.groupCount();
                int i3 = 1;
                while (true) {
                    if (i3 > iGroupCount) {
                        break;
                    }
                    if (matcher4.group(i3) != null) {
                        strGroup = matcher4.group(i3);
                        sb6.delete(matcher4.start(), sb6.length());
                        break;
                    }
                    i3++;
                }
            }
        }
        if (strGroup.length() > 0) {
            oVar.l(strGroup);
        }
        k kVarH = h(str2);
        StringBuilder sb9 = new StringBuilder();
        try {
            iO = o(sb6, kVarH, sb9, oVar);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb6);
            c cVar = c.INVALID_COUNTRY_CODE;
            c cVar2 = e.f163106a;
            if (cVar2 != cVar || !matcher5.lookingAt()) {
                throw new NumberParseException(cVar2, e.getMessage());
            }
            iO = o(sb6.substring(matcher5.end()), kVarH, sb9, oVar);
            if (iO == 0) {
                throw new NumberParseException(c.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iO != 0) {
            String strL = l(iO);
            if (!strL.equals(str2)) {
                kVarH = "001".equals(strL) ? g(iO) : h(strL);
            }
        } else {
            q(sb6);
            sb9.append((CharSequence) sb6);
            if (str2 != null) {
                oVar.k(kVarH.a());
            }
        }
        if (sb9.length() < 2) {
            throw new NumberParseException(c.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (kVarH != null) {
            StringBuilder sb10 = new StringBuilder();
            StringBuilder sb11 = new StringBuilder(sb9);
            p(sb11, kVarH, sb10);
            g gVarV = v(sb11, kVarH, f.UNKNOWN);
            if (gVarV != g.TOO_SHORT && gVarV != g.IS_POSSIBLE_LOCAL_ONLY && gVarV != g.INVALID_LENGTH) {
                sb9 = sb11;
            }
        }
        int length2 = sb9.length();
        if (length2 < 2) {
            throw new NumberParseException(c.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(c.TOO_LONG, "The string supplied is too long to be a phone number.");
        }
        if (sb9.length() > 1 && sb9.charAt(0) == '0') {
            oVar.m();
            int i5 = 1;
            while (i5 < sb9.length() - 1 && sb9.charAt(i5) == '0') {
                i5++;
            }
            if (i5 != 1) {
                oVar.o(i5);
            }
        }
        oVar.n(Long.parseLong(sb9.toString()));
        return oVar;
    }
}
