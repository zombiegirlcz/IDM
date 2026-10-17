package com.google.android.gms.common.data;

import a0.d;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private Object f37989zac;

    public SingleRefDataBufferIterator(@NonNull DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @NonNull
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(d.n("Cannot advance the iterator beyond ", this.f37975zab));
        }
        int i = this.f37975zab + 1;
        this.f37975zab = i;
        if (i == 0) {
            Object objCheckNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.f37989zac = objCheckNotNull;
            if (!(objCheckNotNull instanceof DataBufferRef)) {
                throw new IllegalStateException(a.p("DataBuffer reference of type ", String.valueOf(objCheckNotNull.getClass()), " is not movable"));
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.f37989zac)).zaa(this.f37975zab);
        }
        return this.f37989zac;
    }
}
