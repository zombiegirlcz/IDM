package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.internal.lz0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class e9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f28021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t f28022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28023c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28024a;

        static {
            int[] iArr = new int[c.values().length];
            f28024a = iArr;
            try {
                iArr[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28024a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28024a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f28026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28027c;

        public b(String str, c cVar, String str2) {
            this.f28025a = str;
            this.f28026b = cVar;
            this.f28027c = str2;
        }
    }

    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public enum d {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum e {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    public interface f {
        boolean a(p pVar, lz0.l0 l0Var);
    }

    public static class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f28041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f28042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f28043c;
        private final boolean d;
        private final String e;

        public g(int i, int i2, boolean z, boolean z3, String str) {
            this.f28041a = i;
            this.f28042b = i2;
            this.f28043c = z;
            this.d = z3;
            this.e = str;
        }

        @Override // com.fourthline.orca.internal.e9.f
        public boolean a(p pVar, lz0.l0 l0Var) {
            int i;
            int i2;
            String strG = (this.d && this.e == null) ? l0Var.g() : this.e;
            lz0.j0 j0Var = l0Var.f30871b;
            if (j0Var != null) {
                Iterator it8 = j0Var.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it8.hasNext()) {
                    lz0.l0 l0Var2 = (lz0.l0) ((lz0.n0) it8.next());
                    if (l0Var2 == l0Var) {
                        i = i2;
                    }
                    if (strG == null || l0Var2.g().equals(strG)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            int i3 = this.f28043c ? i + 1 : i2 - i;
            int i5 = this.f28041a;
            if (i5 == 0) {
                return i3 == this.f28042b;
            }
            int i6 = i3 - this.f28042b;
            return i6 % i5 == 0 && (Integer.signum(i6) == 0 || Integer.signum(i3 - this.f28042b) == Integer.signum(this.f28041a));
        }

        public String toString() {
            String str = this.f28043c ? "" : "last-";
            return this.d ? String.format(Locale.US, "nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f28041a), Integer.valueOf(this.f28042b), this.e) : String.format(Locale.US, "nth-%schild(%dn%+d)", str, Integer.valueOf(this.f28041a), Integer.valueOf(this.f28042b));
        }
    }

    public static class h implements f {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fourthline.orca.internal.e9.f
        public boolean a(p pVar, lz0.l0 l0Var) {
            return !(l0Var instanceof lz0.j0) || ((lz0.j0) l0Var).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    public enum i {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final Map z = new HashMap();

        static {
            for (i iVar : values()) {
                if (iVar != UNSUPPORTED) {
                    z.put(iVar.name().replace('_', CoreConstants.DASH_CHAR), iVar);
                }
            }
        }

        public static i a(String str) {
            i iVar = (i) z.get(str);
            return iVar != null ? iVar : UNSUPPORTED;
        }
    }

    public static class k implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28062a;

        public k(String str) {
            this.f28062a = str;
        }

        @Override // com.fourthline.orca.internal.e9.f
        public boolean a(p pVar, lz0.l0 l0Var) {
            return false;
        }

        public String toString() {
            return this.f28062a;
        }
    }

    public static class l implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28064b;

        public l(boolean z, String str) {
            this.f28063a = z;
            this.f28064b = str;
        }

        @Override // com.fourthline.orca.internal.e9.f
        public boolean a(p pVar, lz0.l0 l0Var) {
            int i;
            String strG = (this.f28063a && this.f28064b == null) ? l0Var.g() : this.f28064b;
            lz0.j0 j0Var = l0Var.f30871b;
            if (j0Var != null) {
                Iterator it8 = j0Var.getChildren().iterator();
                i = 0;
                while (it8.hasNext()) {
                    lz0.l0 l0Var2 = (lz0.l0) ((lz0.n0) it8.next());
                    if (strG == null || l0Var2.g().equals(strG)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            return i == 1;
        }

        public String toString() {
            if (!this.f28063a) {
                return "only-child";
            }
            return "only-of-type <" + this.f28064b + ">";
        }
    }

    public static class m implements f {
        @Override // com.fourthline.orca.internal.e9.f
        public boolean a(p pVar, lz0.l0 l0Var) {
            return l0Var.f30871b == null;
        }

        public String toString() {
            return "root";
        }
    }

    public static class n implements f {
        @Override // com.fourthline.orca.internal.e9.f
        public boolean a(p pVar, lz0.l0 l0Var) {
            return pVar != null && l0Var == pVar.f28068a;
        }

        public String toString() {
            return "target";
        }
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r f28065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final m71 f28066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final t f28067c;

        public o(r rVar, m71 m71Var, t tVar) {
            this.f28065a = rVar;
            this.f28066b = m71Var;
            this.f28067c = tVar;
        }

        public String toString() {
            return this.f28065a + " {...} (src=" + this.f28067c + ")";
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        lz0.l0 f28068a;

        public String toString() {
            lz0.l0 l0Var = this.f28068a;
            if (l0Var == null) {
                return "";
            }
            return "<" + l0Var.g() + " id=\"" + this.f28068a.f30864c + "\">";
        }
    }

    public enum t {
        Document,
        RenderOptions
    }

    public e9(t tVar, mz0 mz0Var) {
        this(e.screen, tVar, mz0Var);
    }

    private static List b(f9 f9Var) {
        String strM;
        ArrayList arrayList = new ArrayList();
        while (!f9Var.c() && (strM = f9Var.m()) != null) {
            try {
                arrayList.add(e.valueOf(strM));
            } catch (IllegalArgumentException unused) {
            }
            if (!f9Var.p()) {
                break;
            }
        }
        return arrayList;
    }

    private q c(f9 f9Var) {
        q qVar = new q();
        while (!f9Var.c()) {
            try {
                if (!f9Var.a("<!--") && !f9Var.a("-->")) {
                    if (!f9Var.a('@')) {
                        if (!b(qVar, f9Var)) {
                            break;
                        }
                    } else {
                        a(qVar, f9Var);
                    }
                }
            } catch (d9 e2) {
                e2.getMessage();
                return qVar;
            }
        }
        return qVar;
    }

    private void d(f9 f9Var) {
        int i2 = 0;
        while (!f9Var.c()) {
            int iIntValue = f9Var.e().intValue();
            if (iIntValue == 59 && i2 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i2++;
            } else if (iIntValue == 125 && i2 > 0 && i2 - 1 == 0) {
                return;
            }
        }
    }

    public q a(String str) {
        f9 f9Var = new f9(str);
        f9Var.q();
        return c(f9Var);
    }

    public static class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f28061a;

        public j(List list) {
            this.f28061a = list;
        }

        @Override // com.fourthline.orca.internal.e9.f
        public boolean a(p pVar, lz0.l0 l0Var) {
            Iterator it8 = this.f28061a.iterator();
            while (it8.hasNext()) {
                if (e9.a(pVar, (r) it8.next(), l0Var)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return "not(" + this.f28061a + ")";
        }

        public int a() {
            Iterator it8 = this.f28061a.iterator();
            int i = Integer.MIN_VALUE;
            while (it8.hasNext()) {
                int i2 = ((r) it8.next()).f28071b;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }
    }

    public e9(e eVar, t tVar, mz0 mz0Var) {
        this.f28023c = false;
        this.f28021a = eVar;
        this.f28022b = tVar;
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List f28070a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28071b = 0;

        public void a(s sVar) {
            if (this.f28070a == null) {
                this.f28070a = new ArrayList();
            }
            this.f28070a.add(sVar);
        }

        public void b() {
            this.f28071b++;
        }

        public void c() {
            this.f28071b += 1000000;
        }

        public boolean d() {
            List list = this.f28070a;
            return list == null || list.isEmpty();
        }

        public int e() {
            List list = this.f28070a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder();
            Iterator it8 = this.f28070a.iterator();
            while (it8.hasNext()) {
                sb6.append((s) it8.next());
                sb6.append(zsc.p.SPACE_CHAR);
            }
            sb6.append('[');
            sb6.append(this.f28071b);
            sb6.append(']');
            return sb6.toString();
        }

        public s a(int i) {
            return (s) this.f28070a.get(i);
        }

        public void a() {
            this.f28071b += 1000;
        }
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d f28072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f28073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f28074c = null;
        List d = null;

        public s(d dVar, String str) {
            this.f28072a = dVar == null ? d.DESCENDANT : dVar;
            this.f28073b = str;
        }

        public void a(String str, c cVar, String str2) {
            if (this.f28074c == null) {
                this.f28074c = new ArrayList();
            }
            this.f28074c.add(new b(str, cVar, str2));
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder();
            d dVar = this.f28072a;
            if (dVar == d.CHILD) {
                sb6.append("> ");
            } else if (dVar == d.FOLLOWS) {
                sb6.append("+ ");
            }
            String str = this.f28073b;
            if (str == null) {
                str = "*";
            }
            sb6.append(str);
            List<b> list = this.f28074c;
            if (list != null) {
                for (b bVar : list) {
                    sb6.append('[');
                    sb6.append(bVar.f28025a);
                    int i = a.f28024a[bVar.f28026b.ordinal()];
                    if (i == 1) {
                        sb6.append('=');
                        sb6.append(bVar.f28027c);
                    } else if (i == 2) {
                        sb6.append("~=");
                        sb6.append(bVar.f28027c);
                    } else if (i == 3) {
                        sb6.append("|=");
                        sb6.append(bVar.f28027c);
                    }
                    sb6.append(']');
                }
            }
            List<f> list2 = this.d;
            if (list2 != null) {
                for (f fVar : list2) {
                    sb6.append(CoreConstants.COLON_CHAR);
                    sb6.append(fVar);
                }
            }
            return sb6.toString();
        }

        public void a(f fVar) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(fVar);
        }
    }

    public static boolean a(String str, e eVar) {
        f9 f9Var = new f9(str);
        f9Var.q();
        return a(b(f9Var), eVar);
    }

    private boolean b(q qVar, f9 f9Var) throws d9 {
        List listZ = f9Var.z();
        if (listZ == null || listZ.isEmpty()) {
            return false;
        }
        if (f9Var.a(CoreConstants.CURLY_LEFT)) {
            f9Var.q();
            m71 m71VarA = a(f9Var);
            f9Var.q();
            Iterator it8 = listZ.iterator();
            while (it8.hasNext()) {
                qVar.a(new o((r) it8.next(), m71VarA, this.f28022b));
            }
            return true;
        }
        throw new d9("Malformed rule block: expected '{'");
    }

    private static void a(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f28069a = null;

        public void a(o oVar) {
            if (this.f28069a == null) {
                this.f28069a = new LinkedList();
            }
            ListIterator listIterator = this.f28069a.listIterator();
            while (listIterator.hasNext()) {
                int iNextIndex = listIterator.nextIndex();
                if (((o) listIterator.next()).f28065a.f28071b > oVar.f28065a.f28071b) {
                    this.f28069a.add(iNextIndex, oVar);
                    return;
                }
            }
            this.f28069a.add(oVar);
        }

        public boolean b() {
            List list = this.f28069a;
            return list == null || list.isEmpty();
        }

        public String toString() {
            if (this.f28069a == null) {
                return "";
            }
            StringBuilder sb6 = new StringBuilder();
            Iterator it8 = this.f28069a.iterator();
            while (it8.hasNext()) {
                sb6.append(((o) it8.next()).toString());
                sb6.append('\n');
            }
            return sb6.toString();
        }

        public void a(q qVar) {
            if (qVar.f28069a == null) {
                return;
            }
            if (this.f28069a == null) {
                this.f28069a = new LinkedList();
            }
            Iterator it8 = qVar.f28069a.iterator();
            while (it8.hasNext()) {
                a((o) it8.next());
            }
        }

        public List a() {
            return this.f28069a;
        }

        public void a(t tVar) {
            List list = this.f28069a;
            if (list == null) {
                return;
            }
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((o) it8.next()).f28067c == tVar) {
                    it8.remove();
                }
            }
        }
    }

    private static boolean a(List list, e eVar) {
        if (list.size() == 0) {
            return true;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            e eVar2 = (e) it8.next();
            if (eVar2 == e.all || eVar2 == eVar) {
                return true;
            }
        }
        return false;
    }

    private void a(q qVar, f9 f9Var) throws d9 {
        String strV = f9Var.v();
        f9Var.q();
        if (strV != null) {
            if (!this.f28023c && strV.equals("media")) {
                List listB = b(f9Var);
                if (f9Var.a(CoreConstants.CURLY_LEFT)) {
                    f9Var.q();
                    if (a(listB, this.f28021a)) {
                        this.f28023c = true;
                        qVar.a(c(f9Var));
                        this.f28023c = false;
                    } else {
                        c(f9Var);
                    }
                    if (!f9Var.c() && !f9Var.a(CoreConstants.CURLY_RIGHT)) {
                        throw new d9("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new d9("Invalid @media rule: missing rule set");
                }
            } else if (!this.f28023c && strV.equals("import")) {
                String strA = f9Var.A();
                if (strA == null) {
                    strA = f9Var.t();
                }
                if (strA != null) {
                    f9Var.q();
                    b(f9Var);
                    if (!f9Var.c() && !f9Var.a(';')) {
                        throw new d9("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new d9("Invalid @import rule: expected string or url()");
                }
            } else {
                a("Ignoring @%s rule", strV);
                d(f9Var);
            }
            f9Var.q();
            return;
        }
        throw new d9("Invalid '@' rule");
    }

    public static List b(String str) {
        f9 f9Var = new f9(str);
        ArrayList arrayList = null;
        while (!f9Var.c()) {
            String strK = f9Var.k();
            if (strK != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strK);
                f9Var.q();
            }
        }
        return arrayList;
    }

    private m71 a(f9 f9Var) throws d9 {
        m71 m71Var = new m71();
        do {
            String strV = f9Var.v();
            f9Var.q();
            if (f9Var.a(CoreConstants.COLON_CHAR)) {
                f9Var.q();
                String strX = f9Var.x();
                if (strX != null) {
                    f9Var.q();
                    if (f9Var.a('!')) {
                        f9Var.q();
                        if (f9Var.a("important")) {
                            f9Var.q();
                        } else {
                            throw new d9("Malformed rule set: found unexpected '!'");
                        }
                    }
                    f9Var.a(';');
                    m71.a(m71Var, strV, strX, false);
                    f9Var.q();
                    if (f9Var.c()) {
                        break;
                    }
                } else {
                    throw new d9("Expected property value");
                }
            } else {
                throw new d9("Expected ':'");
            }
        } while (!f9Var.a(CoreConstants.CURLY_RIGHT));
        return m71Var;
    }

    public static boolean a(p pVar, r rVar, lz0.l0 l0Var) {
        if (rVar.e() == 1) {
            return a(pVar, rVar.a(0), l0Var);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 = l0Var.f30871b; obj2 != null; obj2 = ((lz0.n0) obj2).f30871b) {
            arrayList.add(obj2);
        }
        Collections.reverse(arrayList);
        return a(pVar, rVar, rVar.e() - 1, arrayList, arrayList.size() - 1, l0Var);
    }

    private static boolean a(p pVar, r rVar, int i2, List list, int i3, lz0.l0 l0Var) {
        s sVarA = rVar.a(i2);
        if (!a(pVar, sVarA, l0Var)) {
            return false;
        }
        d dVar = sVarA.f28072a;
        if (dVar == d.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 >= 0) {
                if (a(pVar, rVar, i2 - 1, list, i3)) {
                    return true;
                }
                i3--;
            }
            return false;
        }
        if (dVar == d.CHILD) {
            return a(pVar, rVar, i2 - 1, list, i3);
        }
        int iA = a(list, i3, l0Var);
        if (iA <= 0) {
            return false;
        }
        return a(pVar, rVar, i2 - 1, list, i3, (lz0.l0) l0Var.f30871b.getChildren().get(iA - 1));
    }

    private static boolean a(p pVar, r rVar, int i2, List list, int i3) {
        s sVarA = rVar.a(i2);
        lz0.l0 l0Var = (lz0.l0) list.get(i3);
        if (!a(pVar, sVarA, l0Var)) {
            return false;
        }
        d dVar = sVarA.f28072a;
        if (dVar == d.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 > 0) {
                i3--;
                if (a(pVar, rVar, i2 - 1, list, i3)) {
                    return true;
                }
            }
            return false;
        }
        if (dVar == d.CHILD) {
            return a(pVar, rVar, i2 - 1, list, i3 - 1);
        }
        int iA = a(list, i3, l0Var);
        if (iA <= 0) {
            return false;
        }
        return a(pVar, rVar, i2 - 1, list, i3, (lz0.l0) l0Var.f30871b.getChildren().get(iA - 1));
    }

    private static int a(List list, int i2, lz0.l0 l0Var) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        Object obj2 = list.get(i2);
        lz0.j0 j0Var = l0Var.f30871b;
        if (obj2 != j0Var) {
            return -1;
        }
        Iterator it8 = j0Var.getChildren().iterator();
        while (it8.hasNext()) {
            if (((lz0.n0) it8.next()) == l0Var) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    private static boolean a(p pVar, s sVar, lz0.l0 l0Var) {
        List list;
        String str = sVar.f28073b;
        if (str != null && !str.equals(l0Var.g().toLowerCase(Locale.US))) {
            return false;
        }
        List list2 = sVar.f28074c;
        if (list2 != null) {
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) sVar.f28074c.get(i2);
                String str2 = bVar.f28025a;
                str2.getClass();
                if (!str2.equals("id")) {
                    if (!str2.equals("class") || (list = l0Var.f30865g) == null || !list.contains(bVar.f28027c)) {
                        return false;
                    }
                } else if (!bVar.f28027c.equals(l0Var.f30864c)) {
                    return false;
                }
            }
        }
        List list3 = sVar.d;
        if (list3 == null) {
            return true;
        }
        int size2 = list3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (!((f) sVar.d.get(i3)).a(pVar, l0Var)) {
                return false;
            }
        }
        return true;
    }
}
