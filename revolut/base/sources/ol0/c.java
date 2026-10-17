package ol0;

import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nl0.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.b f226284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f226285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f226286c;

    public c(f.b options, Set formattings, int i) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(formattings, "formattings");
        this.f226284a = options;
        this.f226285b = formattings;
        this.f226286c = new StringBuilder((int) (((double) i) * 1.2d));
    }

    public final int a(int i, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            l lVar = (l) list.get(i2);
            StringBuilder sb6 = this.f226286c;
            int length = sb6.length();
            int i3 = 1;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        sb6.append("; ");
                    }
                    i3 = i;
                } else {
                    sb6.append(": ");
                    i3 = 2;
                }
            }
            int length2 = sb6.length();
            List list2 = lVar.f226298c;
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                d((i) list2.get(i5));
            }
            if (sb6.length() == length2) {
                sb6.setLength(length);
            } else {
                i = i3;
            }
        }
        return i;
    }

    public final void b(List list, String str, nl0.h hVar) {
        int i = 0;
        if (!this.f226285b.contains(hVar)) {
            int size = list.size();
            while (i < size) {
                d((n) list.get(i));
                i++;
            }
            return;
        }
        StringBuilder sb6 = this.f226286c;
        sb6.append("<");
        sb6.append(str);
        sb6.append(">");
        int size2 = list.size();
        while (i < size2) {
            d((n) list.get(i));
            i++;
        }
        a0.d.C(sb6, "</", str, ">");
    }

    public final void c(l lVar, boolean z) {
        int i;
        if (this.f226285b.contains(nl0.h.NEW_LINE) && !z) {
            int i2 = b.f226283b[this.f226284a.f216983c.ordinal()];
            if (i2 == 1) {
                i = lVar.d;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                this.f226286c.append("<br>");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(ol0.n r25) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.c.d(ol0.n):void");
    }
}
