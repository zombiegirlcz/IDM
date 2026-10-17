package jp3;

import com.revolut.data.model.Data;
import hp3.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f177198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f177199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177200c;

    public e(d dVar, Data data, Ref$BooleanRef ref$BooleanRef) {
        this.f177198a = dVar.f177196a;
        Intrinsics.h(data);
        this.f177199b = data;
        boolean z = ref$BooleanRef.f186407a;
        ref$BooleanRef.f186407a = false;
        this.f177200c = z;
    }
}
