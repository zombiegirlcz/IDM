package qw7;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import ql7.v1;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249825a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f249826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f249827c;
    public final e4m.e d;

    public i(e eVar, f fVar) {
        this.f249826b = eVar;
        int i = 22;
        this.f249827c = e4m.b.b(new v1(eVar, this, 1, i));
        this.d = e4m.b.b(new v1(eVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f249825a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f249825a) {
        }
        return ImmutableSet.of();
    }

    public i(e eVar) {
        this.f249826b = eVar;
        int i = 23;
        this.f249827c = e4m.b.b(new v1(eVar, this, 1, i));
        this.d = e4m.b.b(new v1(eVar, this, 0, i));
    }
}
