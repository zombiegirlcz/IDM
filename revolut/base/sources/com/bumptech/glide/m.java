package com.bumptech.glide;

import java.util.HashSet;
import java.util.Set;
import r8.q;

/* JADX INFO: loaded from: classes.dex */
public final class m implements r8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f26131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f26132b;

    public m(n nVar, q qVar) {
        this.f26132b = nVar;
        this.f26131a = qVar;
    }

    @Override // r8.a
    public final void a(boolean z) {
        if (z) {
            synchronized (this.f26132b) {
                q qVar = this.f26131a;
                for (u8.c cVar : y8.l.e((Set) qVar.f252298c)) {
                    if (!cVar.isComplete() && !cVar.c()) {
                        cVar.clear();
                        if (qVar.f252297b) {
                            ((HashSet) qVar.d).add(cVar);
                        } else {
                            cVar.i();
                        }
                    }
                }
            }
        }
    }
}
