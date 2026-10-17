package mif;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dgm.e f205789a;

    public b() {
        dgm.e eVar = new dgm.e();
        Intrinsics.checkNotNullExpressionValue(eVar, "create(...)");
        this.f205789a = eVar;
    }

    public abstract void a(ArrayList arrayList);

    public abstract void b(ArrayList arrayList);
}
