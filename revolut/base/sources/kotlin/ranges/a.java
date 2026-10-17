package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/ranges/a;", "", "", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements Iterable<Character>, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f186445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f186446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f186447c = 1;

    public a(char c2, char c3) {
        this.f186445a = c2;
        this.f186446b = (char) iim.b.a(c2, c3, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new vim.a(this.f186445a, this.f186446b, this.f186447c);
    }
}
