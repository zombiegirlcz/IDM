package ipa;

import b9.w2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f167710h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f167711j;
    public final w2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m style, int i, w2 w2Var, String id10, String tag2, h type, i channel, f pushDestination, l priority) {
        super(id10, 0, tag2, channel, pushDestination, true, priority);
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter("CHAT_GROUP_NAME", "groupName");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(pushDestination, "pushDestination");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f167710h = style;
        this.i = i;
        this.f167711j = "CHAT_GROUP_NAME";
        this.k = w2Var;
    }
}
