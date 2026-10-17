package p40;

import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.domain.model.ChatMode;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f232776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v30.s f232777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AgentInfo f232778c;
    public final List d;
    public final ChatMode e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f232779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f232780h;
    public final boolean i;

    public i(c0 feedType, v30.s chatPricingPlan, AgentInfo agentInfo, List features, ChatMode chatMode, k selectedTab, Data photos, Data files, boolean z) {
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(chatPricingPlan, "chatPricingPlan");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(files, "files");
        this.f232776a = feedType;
        this.f232777b = chatPricingPlan;
        this.f232778c = agentInfo;
        this.d = features;
        this.e = chatMode;
        this.f = selectedTab;
        this.f232779g = photos;
        this.f232780h = files;
        this.i = z;
    }

    public static i a(i iVar, AgentInfo agentInfo, k kVar, Data data, Data data2, boolean z, int i) {
        c0 feedType = iVar.f232776a;
        v30.s chatPricingPlan = iVar.f232777b;
        if ((i & 4) != 0) {
            agentInfo = iVar.f232778c;
        }
        AgentInfo agentInfo2 = agentInfo;
        List features = iVar.d;
        ChatMode chatMode = iVar.e;
        if ((i & 32) != 0) {
            kVar = iVar.f;
        }
        k selectedTab = kVar;
        if ((i & 64) != 0) {
            data = iVar.f232779g;
        }
        Data photos = data;
        if ((i & 128) != 0) {
            data2 = iVar.f232780h;
        }
        Data files = data2;
        boolean z3 = (i & 256) != 0 ? iVar.i : z;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(chatPricingPlan, "chatPricingPlan");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(files, "files");
        return new i(feedType, chatPricingPlan, agentInfo2, features, chatMode, selectedTab, photos, files, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f232776a == iVar.f232776a && this.f232777b == iVar.f232777b && Intrinsics.f(this.f232778c, iVar.f232778c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f && Intrinsics.f(this.f232779g, iVar.f232779g) && Intrinsics.f(this.f232780h, iVar.f232780h) && this.i == iVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f232777b.hashCode() + (this.f232776a.hashCode() * 31)) * 31;
        AgentInfo agentInfo = this.f232778c;
        return Boolean.hashCode(this.i) + kii.e.c(this.f232780h, kii.e.c(this.f232779g, (this.f.hashCode() + ((this.e.hashCode() + p.a.d((iHashCode + (agentInfo == null ? 0 : agentInfo.hashCode())) * 31, 31, this.d)) * 31)) * 31, 31), 31);
    }
}
