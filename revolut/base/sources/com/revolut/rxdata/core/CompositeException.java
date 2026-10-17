package com.revolut.rxdata.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u4e.i;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/rxdata/core/CompositeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "data_observable_delegate_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CompositeException extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f104677c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f104678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104679b;

    public CompositeException(List throwables) {
        Intrinsics.checkNotNullParameter(throwables, "throwables");
        this.f104678a = throwables;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = throwables.iterator();
        while (it8.hasNext()) {
            String message = ((Throwable) it8.next()).getMessage();
            if (message != null) {
                arrayList.add(message);
            }
        }
        this.f104679b = d0.k0(arrayList, null, null, null, 0, null, 63);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getF104678a() {
        return this.f104678a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f104679b;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return d0.k0(this.f104678a, null, null, null, 0, new i(6), 31);
    }
}
