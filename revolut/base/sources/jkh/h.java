package jkh;

import com.revolut.data.model.Data;
import java.util.List;
import jxi.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f175176b;

    public /* synthetic */ h(Data data, int i) {
        this.f175175a = i;
        this.f175176b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f175175a) {
            case 0:
                return kih.c.a((kih.c) obj2, null, this.f175176b, false, 5);
            case 1:
                ((jnb.b) obj2).getClass();
                Data contentData = this.f175176b;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new jnb.b(contentData);
            case 2:
                jnc.e update = (jnc.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jnc.e.a(update, null, null, null, null, this.f175176b, 31);
            case 3:
                return jnc.e.a((jnc.e) obj2, null, null, this.f175176b, null, null, 55);
            case 4:
                return jnc.e.a((jnc.e) obj2, null, null, null, this.f175176b, null, 47);
            case 5:
                return jnc.e.a((jnc.e) obj2, null, null, null, null, this.f175176b, 31);
            case 6:
                return jnc.e.a((jnc.e) obj2, null, this.f175176b, null, null, null, 61);
            case 7:
                Data data = this.f175176b;
                Intrinsics.h(data);
                return joa.c.a((joa.c) obj2, null, null, null, null, false, false, null, data, null, 383);
            case 8:
                return jph.f.a((jph.f) obj2, null, false, this.f175176b, 3);
            case 9:
                ((gjl.a) obj2).getClass();
                Data connectedApps = this.f175176b;
                Intrinsics.checkNotNullParameter(connectedApps, "connectedApps");
                return new gjl.a(connectedApps);
            case 10:
                return jq4.h.a((jq4.h) obj2, this.f175176b, null, 2);
            case 11:
                ((jq6.b) obj2).getClass();
                return new jq6.b(this.f175176b);
            case 12:
                return jqg.i.a((jqg.i) obj2, this.f175176b, false, 6);
            case 13:
                ((js4.e) obj2).getClass();
                Data model = this.f175176b;
                Intrinsics.checkNotNullParameter(model, "model");
                return new js4.e(model);
            case 14:
                return jsk.f.a((jsk.f) obj2, this.f175176b, null, 2);
            case 15:
                return jsk.f.a((jsk.f) obj2, null, this.f175176b, 1);
            case 16:
                ((jt4.b) obj2).getClass();
                Data dialog = this.f175176b;
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                return new jt4.b(dialog);
            case 17:
                String raffleCampaignId = ((jta.e) obj2).f178440a;
                Intrinsics.checkNotNullParameter(raffleCampaignId, "raffleCampaignId");
                Data raffleCampaign = this.f175176b;
                Intrinsics.checkNotNullParameter(raffleCampaign, "raffleCampaign");
                return new jta.e(raffleCampaign, raffleCampaignId);
            case 18:
                ((ju4.b) obj2).getClass();
                Data content = this.f175176b;
                Intrinsics.checkNotNullParameter(content, "content");
                return new ju4.b(content);
            case 19:
                return juk.e.a((juk.e) obj2, this.f175176b, null, null, 13);
            case 20:
                return juk.e.a((juk.e) obj2, null, this.f175176b, null, 11);
            case 21:
                return juk.e.a((juk.e) obj2, null, null, this.f175176b, 7);
            case 22:
                return jvc.i.a((jvc.i) obj2, false, null, null, null, null, null, false, null, null, false, (l71.d) this.f175176b.getContent(), 32767);
            case 23:
                return jvc.i.a((jvc.i) obj2, false, null, null, (List) this.f175176b.getContent(), null, null, false, null, null, false, null, 65503);
            case 24:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, this.f175176b, null, null, null, null, null, 16127);
            case 25:
                return r.a((r) obj2, this.f175176b, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382);
            case 26:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, null, null, (hha.d) this.f175176b.getContent(), null, null, 14335);
            case 27:
                return r.a((r) obj2, null, null, null, null, null, this.f175176b, null, null, null, null, null, null, null, null, 16351);
            case 28:
                return r.a((r) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f175176b, null, 12287);
            default:
                Data data2 = this.f175176b;
                Intrinsics.h(data2);
                return r.a((r) obj2, null, data2, null, null, null, null, null, null, null, null, null, null, null, null, 16381);
        }
    }
}
