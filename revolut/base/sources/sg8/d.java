package sg8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg8.a f262620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f262621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f262622c;

    public d(c cVar, lg8.a aVar) {
        this.f262620a = aVar;
        int i = 15;
        this.f262621b = e4m.b.b(new ryc.d(cVar, this, 1, i));
        this.f262622c = e4m.b.b(new ryc.d(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
