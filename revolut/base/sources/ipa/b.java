package ipa;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f167687h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f167688j;
    public final List k;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String id10, String tag2, h type, i channel, String title, String message, int i, ArrayList arrayList, f pushDestination, l lVar, int i2) {
        List buttonActions = (i2 & 256) != 0 ? f0.f322471a : arrayList;
        l priority = (i2 & 2048) != 0 ? l.DEFAULT : lVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(buttonActions, "buttonActions");
        Intrinsics.checkNotNullParameter(pushDestination, "pushDestination");
        Intrinsics.checkNotNullParameter(priority, "priority");
        super(id10, 0, tag2, channel, pushDestination, true, priority);
        this.f167687h = title;
        this.i = message;
        this.f167688j = i;
        this.k = buttonActions;
    }
}
