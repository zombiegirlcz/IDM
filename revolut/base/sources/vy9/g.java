package vy9;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy9.d f293287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ phm.a f293288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gte.a f293289c;
    public final /* synthetic */ bz9.b d;

    public g(zy9.d dVar, a aVar, gte.a aVar2, bz9.b bVar) {
        this.f293287a = dVar;
        this.f293288b = aVar;
        this.f293289c = aVar2;
        this.d = bVar;
    }

    public final bz9.e a() {
        Object obj2 = this.f293288b.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        gte.a aVar = this.f293289c;
        bz9.b bVar = this.d;
        return new bz9.e(this.f293287a, (Set) obj2, aVar, bVar);
    }
}
