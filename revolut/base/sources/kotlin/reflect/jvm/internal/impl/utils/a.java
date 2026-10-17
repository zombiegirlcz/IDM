package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends DFS.AbstractNodeHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f187884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f187885b;

    public a(Function1 function1, boolean[] zArr) {
        this.f187884a = function1;
        this.f187885b = zArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public final boolean beforeChildren(Object obj2) {
        boolean zBooleanValue = ((Boolean) this.f187884a.invoke(obj2)).booleanValue();
        boolean[] zArr = this.f187885b;
        if (zBooleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public final Object result() {
        return Boolean.valueOf(this.f187885b[0]);
    }
}
