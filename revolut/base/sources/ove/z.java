package ove;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements eze.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230175a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dze.d f230176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f230177c;

    public z(t tVar, h hVar, dze.d dVar) {
        this.f230176b = dVar;
        this.f230177c = e4m.b.b(new d2h.b(tVar, 13, hVar, this));
    }

    @Override // eze.a
    public final dze.g a() {
        switch (this.f230175a) {
        }
        return (dze.g) this.f230177c.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f230175a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f230175a) {
        }
        return ImmutableSet.of();
    }

    public z(t tVar, j jVar, dze.d dVar) {
        this.f230176b = dVar;
        this.f230177c = e4m.b.b(new d2h.b(tVar, 11, jVar, this));
    }

    public z(t tVar, u uVar, dze.d dVar) {
        this.f230176b = dVar;
        this.f230177c = e4m.b.b(new d2h.b(tVar, 12, uVar, this));
    }
}
