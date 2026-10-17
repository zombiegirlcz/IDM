package sx3;

import cv3.c0;
import cv3.h;
import elm.f;
import gim.c;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import w34.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f266355a;

    public a(b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f266355a = repository;
    }

    public final Object a(String str, h hVar, c0 c0Var, c cVar) {
        b bVar = this.f266355a;
        bVar.getClass();
        w34.a aVar = new w34.a(bVar, str, hVar, c0Var, null, 1);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, aVar, cVar);
    }
}
