package com.fourthline.orca.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b3 implements te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26967a = new ArrayList();

    @Override // com.fourthline.orca.internal.te
    public void a(Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Iterator it8 = this.f26967a.iterator();
        while (it8.hasNext()) {
            ((re) it8.next()).a(deepLink);
        }
    }

    @Override // com.fourthline.orca.internal.te
    public void a(re handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f26967a.add(handler);
    }
}
