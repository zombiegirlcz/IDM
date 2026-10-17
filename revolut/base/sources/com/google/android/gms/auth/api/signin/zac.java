package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
final class zac implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj2, Object obj3) {
        return ((Scope) obj2).getScopeUri().compareTo(((Scope) obj3).getScopeUri());
    }
}
