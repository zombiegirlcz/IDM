package com.revolut.data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/revolut/data/model/Data;", "T", "", "content", "error", "", "loading", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;Z)V", "getContent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/Throwable;", "getLoading", "()Z", "equals", "other", "hashCode", "", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Throwable;Z)Lcom/revolut/data/model/Data;", "toString", "", "data_observable_delegate_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Data<T> {
    private final T content;
    private final Throwable error;
    private final boolean loading;

    public Data() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, Object obj2, Throwable th10, boolean z, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj2 = data.content;
        }
        if ((i & 2) != 0) {
            th10 = data.error;
        }
        if ((i & 4) != 0) {
            z = data.loading;
        }
        return data.copy(obj2, th10, z);
    }

    public final T component1() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    @NotNull
    public final Data<T> copy(T content, Throwable error, boolean loading) {
        return new Data<>(content, error, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Data.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type com.revolut.data.model.Data<*>");
        Data data = (Data) other;
        if (!Intrinsics.f(this.content, data.content)) {
            return false;
        }
        Throwable th10 = this.error;
        Class<?> cls = th10 != null ? th10.getClass() : null;
        Throwable th11 = data.error;
        if (!Intrinsics.f(cls, th11 != null ? th11.getClass() : null)) {
            return false;
        }
        Throwable th12 = this.error;
        String message = th12 != null ? th12.getMessage() : null;
        Throwable th13 = data.error;
        return Intrinsics.f(message, th13 != null ? th13.getMessage() : null) && this.loading == data.loading;
    }

    public final T getContent() {
        return this.content;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public int hashCode() {
        String message;
        T t2 = this.content;
        int iHashCode = 0;
        int iHashCode2 = (t2 != null ? t2.hashCode() : 0) * 31;
        Throwable th10 = this.error;
        int iHashCode3 = (iHashCode2 + (th10 != null ? th10.getClass().hashCode() : 0)) * 31;
        Throwable th11 = this.error;
        if (th11 != null && (message = th11.getMessage()) != null) {
            iHashCode = message.hashCode();
        }
        return Boolean.hashCode(this.loading) + ((iHashCode3 + iHashCode) * 31);
    }

    public Data(T t2, Throwable th10, boolean z) {
        this.content = t2;
        this.error = th10;
        this.loading = z;
    }

    public /* synthetic */ Data(Object obj2, Throwable th10, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj2, (i & 2) != 0 ? null : th10, (i & 4) != 0 ? false : z);
    }
}
