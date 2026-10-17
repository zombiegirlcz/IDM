package lti;

import com.google.common.collect.ImmutableSet;
import java.util.Collections;
import java.util.Set;
import ljl.y;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199958a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fji.h f199959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199960c;
    public final e4m.e d;

    public u(tii.b bVar, fji.h hVar) {
        this.f199959b = hVar;
        int i = 28;
        this.f199960c = e4m.b.b(new sac.a(this, 1, i));
        this.d = e4m.b.b(new sac.a(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f199958a) {
            case 0:
                return ImmutableSet.of();
            default:
                return Collections.EMPTY_SET;
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f199958a) {
            case 0:
                return ImmutableSet.of();
            default:
                return Collections.EMPTY_SET;
        }
    }

    public u(g gVar, k kVar, fji.h hVar) {
        this.f199959b = hVar;
        int i = 14;
        this.f199960c = e4m.b.b(new y(this, 1, i));
        this.d = e4m.b.b(new y(this, 0, i));
    }
}
