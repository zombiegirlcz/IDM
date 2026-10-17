package nl0;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ol0.p;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();
    public static final List d = v.k(h.HEADER, h.UNORDERED_LIST, h.ORDERED_LIST, h.BOLD, h.ITALIC, h.STRIKE, h.LINK, h.HTTP_HTTPS_LINK, h.NEW_LINE);
    public static final Lazy e = yhm.j.b(new nk4.d(17));
    public static final Lazy f = yhm.j.b(new nk4.d(18));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f216978a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pair f216979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Pair f216980c;

    public static final class a {
        private a() {
        }

        public static final Map a(a aVar, j jVar) {
            d dVar;
            d dVar2;
            d dVar3;
            d dVar4;
            aVar.getClass();
            d dVar5 = new d(new Regex("(?!)"), new njf.d(25), new njf.d(27));
            int[] iArr = e.f216977a;
            int i = iArr[jVar.ordinal()];
            if (i == 1) {
                dVar = dVar5;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = new d(new Regex("((?:^|\\n)+)(\\s*)([\\-\\+\\*])\\s+(.+)"), new c(2), new c(3));
            }
            int i2 = iArr[jVar.ordinal()];
            if (i2 == 1) {
                dVar2 = new d(new Regex("(\\s+|>|_|~|^)(\\*)(.+?)\\2"), new c(4), new c(5));
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar2 = new d(new Regex("(\\*\\*|__)(.+?)\\1"), new c(7), new c(8));
            }
            int i3 = iArr[jVar.ordinal()];
            if (i3 == 1) {
                dVar3 = new d(new Regex("(\\s+|>|\\*|~|^)(\\_)(.+?)\\2"), new c(9), new c(10));
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar3 = new d(new Regex("(\\*|_)(.+?)\\1"), new c(6), new c(11));
            }
            int i5 = iArr[jVar.ordinal()];
            if (i5 == 1) {
                dVar4 = new d(new Regex("(\\s+|>|_|\\*|^)(~)(.+?)\\2"), new c(12), new c(13));
            } else {
                if (i5 != 2 && i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar4 = new d(new Regex("(~~)(.+?)\\1"), new c(14), new c(15));
            }
            return r0.k(new Pair(h.HEADER, new d(new Regex("(#{1,6} )(.+)"), new c(16), new c(17))), new Pair(h.UNORDERED_LIST, dVar), new Pair(h.ORDERED_LIST, dVar5), new Pair(h.BOLD, dVar2), new Pair(h.ITALIC, dVar3), new Pair(h.STRIKE, dVar4), new Pair(h.LINK, new d(new Regex("\\[([^\\[\\]]+)\\]\\(([^)]+)\\)"), new c(18), new njf.d(26))), new Pair(h.HTTP_HTTPS_LINK, new d(new Regex("(^|\\s)((http|https):\\/\\/)(.*?)($|\\s)"), new njf.d(28), new njf.d(29))), new Pair(h.NEW_LINE, new d(new Regex("\\\\n|\\n"), new c(0), new c(1))));
        }

        public static String b(String str) {
            int length = str.length();
            while (length > 0) {
                char cCharAt = str.charAt(length - 1);
                if (cCharAt != '!' && cCharAt != '\"' && cCharAt != '\'' && cCharAt != ')' && cCharAt != ',' && cCharAt != '.' && cCharAt != ';' && cCharAt != '?' && cCharAt != ']') {
                    break;
                }
                length--;
            }
            String strSubstring = str.substring(0, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
    }

    public static final class b {

        @NotNull
        public static final a Companion = new a();
        public static final b e = new b(15, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f216981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f216982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nl0.b f216983c;
        public final k50.p d;

        public static final class a {
            private a() {
            }
        }

        public b() {
            this(15, null);
        }

        public static b a(b bVar, nl0.b blockSpacing, k50.p pVar, int i) {
            int i2 = bVar.f216981a;
            Set replacements = bVar.f216982b;
            if ((i & 8) != 0) {
                pVar = bVar.d;
            }
            bVar.getClass();
            Intrinsics.checkNotNullParameter(replacements, "replacements");
            Intrinsics.checkNotNullParameter(blockSpacing, "blockSpacing");
            return new b(i2, replacements, blockSpacing, pVar);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f216981a == bVar.f216981a && Intrinsics.f(this.f216982b, bVar.f216982b) && this.f216983c == bVar.f216983c && Intrinsics.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f216983c.hashCode() + p.a.f(Integer.hashCode(this.f216981a) * 31, 31, this.f216982b)) * 31;
            k50.p pVar = this.d;
            return iHashCode + (pVar == null ? 0 : pVar.hashCode());
        }

        public b(int i, Set set) {
            this((i & 1) != 0 ? -1 : 2, (i & 2) != 0 ? h0.f322473a : set, nl0.b.ARBITRARY, null);
        }

        public b(int i, Set replacements, nl0.b blockSpacing, k50.p pVar) {
            Intrinsics.checkNotNullParameter(replacements, "replacements");
            Intrinsics.checkNotNullParameter(blockSpacing, "blockSpacing");
            this.f216981a = i;
            this.f216982b = replacements;
            this.f216983c = blockSpacing;
            this.d = pVar;
        }
    }

    public static String c(f fVar, String str, Set set) {
        j jVar = j.LEGACY;
        b.Companion.getClass();
        return fVar.a(str, set, jVar, b.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.CharSequence r25, java.util.Set r26, nl0.j r27, nl0.f.b r28) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl0.f.a(java.lang.CharSequence, java.util.Set, nl0.j, nl0.f$b):java.lang.String");
    }

    public final String b(String markedText, Set formattings, j syntaxMode, b options) {
        Regex regex;
        Regex regex2;
        Intrinsics.checkNotNullParameter(markedText, "markedText");
        Intrinsics.checkNotNullParameter("revolut", "scheme");
        Intrinsics.checkNotNullParameter("chargebacks", "replaceable");
        Intrinsics.checkNotNullParameter("https://sc.revolut.com/chargebacks", "replacement");
        Intrinsics.checkNotNullParameter(formattings, "formattings");
        Intrinsics.checkNotNullParameter(syntaxMode, "syntaxMode");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(markedText, "markedText");
        Intrinsics.checkNotNullParameter("revolut", "scheme");
        Intrinsics.checkNotNullParameter(formattings, "formattings");
        Intrinsics.checkNotNullParameter(syntaxMode, "syntaxMode");
        Intrinsics.checkNotNullParameter(options, "options");
        String strA = a(markedText, formattings, syntaxMode, options);
        h hVar = h.LINK;
        if (formattings.contains(hVar) || formattings.contains(h.HTTP_HTTPS_LINK)) {
            Pair pair = this.f216979b;
            if (pair == null || !Intrinsics.f(pair.f186385a, "revolut")) {
                regex = new Regex("(<a\\s[^>]*>[\\s\\S]*?</a>)|(^|\\s|\\\\n|>|\"|'|\\(|\\[)(revolut:\\/\\/app\\/)(.*?)(?=$|\\s|\\\\n|<)");
                this.f216979b = new Pair("revolut", regex);
            } else {
                regex = (Regex) pair.f186386b;
            }
            strA = regex.h(strA, new njf.d(23));
        }
        if (!formattings.contains(hVar) && !formattings.contains(h.HTTP_HTTPS_LINK)) {
            return strA;
        }
        Pair pair2 = this.f216980c;
        if (pair2 == null || !Intrinsics.f(pair2.f186385a, "revolut://chargebacks")) {
            regex2 = new Regex("(^|\\s)(revolut:\\/\\/(chargebacks)\\/)(.*?)($|\\s)");
            this.f216980c = new Pair("revolut://chargebacks", regex2);
        } else {
            regex2 = (Regex) pair2.f186386b;
        }
        return regex2.h(strA, new njf.d(22));
    }
}
