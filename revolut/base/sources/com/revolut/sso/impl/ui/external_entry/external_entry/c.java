package com.revolut.sso.impl.ui.external_entry.external_entry;

import android.os.Bundle;
import zml.h;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements b {
    public static h a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_KEY_INTERNAL_ERROR", i);
        return new h(bundle);
    }
}
