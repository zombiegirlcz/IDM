package jya;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f179353a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Data data) {
        super(data.getError());
        Intrinsics.checkNotNullParameter(data, "data");
        this.f179353a = data;
    }
}
