package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class Dash extends PatternItem {
    public final float length;

    public Dash(float f) {
        super(0, Float.valueOf(Math.max(f, BitmapDescriptorFactory.HUE_RED)));
        this.length = Math.max(f, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    @NonNull
    public String toString() {
        return n.t(this.length, "]", new StringBuilder("[Dash: length="));
    }
}
