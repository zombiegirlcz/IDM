package bac;

import b6b.m;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14038a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f14039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f14040c;
    public final e4m.e d;

    public i(b bVar) {
        this.f14039b = bVar;
        int i = 20;
        this.f14040c = e4m.b.b(new m(bVar, this, 1, i));
        this.d = e4m.b.b(new m(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f14038a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f14038a) {
        }
        return ImmutableSet.of();
    }

    public i(b bVar, c cVar) {
        this.f14039b = bVar;
        int i = 19;
        this.f14040c = e4m.b.b(new m(bVar, this, 1, i));
        this.d = e4m.b.b(new m(bVar, this, 0, i));
    }
}
