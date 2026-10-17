package ipa;

import ipa.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f167689h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f167690j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, String summaryDescription, String id10, h type, i channel, l priority) {
        super(id10, 777123777, "CHAT_GROUP_TAG", channel, e.a.f167693a, true, priority);
        Intrinsics.checkNotNullParameter("CHAT_GROUP_NAME", "groupName");
        Intrinsics.checkNotNullParameter(summaryDescription, "summaryDescription");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter("CHAT_GROUP_TAG", "tag");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f167689h = i;
        this.i = "CHAT_GROUP_NAME";
        this.f167690j = summaryDescription;
    }
}
