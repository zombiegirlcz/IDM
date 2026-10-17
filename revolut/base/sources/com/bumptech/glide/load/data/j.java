package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f26113b = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26114a;

    public j() {
        this.f26114a = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.g
    public Object a() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f26114a).rewind();
    }

    public ParcelFileDescriptor b() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f26114a).rewind();
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
    }

    public j(ParcelFileDescriptor parcelFileDescriptor) {
        this.f26114a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }
}
