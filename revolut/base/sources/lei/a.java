package lei;

import android.net.Uri;
import aw0.v1;
import gei.e;
import gei.f;
import kei.g;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f194556a = r0.k(new Pair("StrictMandatory", e.StrictMandatory), new Pair("Mandatory", e.Mandatory), new Pair("Optional", e.Optional));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f194557b = r0.k(new Pair("CREATED", f.CREATED), new Pair("VIEWED", f.VIEWED), new Pair("CANCELLED", f.CANCELLED), new Pair("OPENED", f.OPENED));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f194558c = r0.k(new Pair("dark", v1.DARK), new Pair("light", v1.LIGHT));

    public static final String a(String str, g gVar) {
        String campaignId;
        String messageId;
        String tileId;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (gVar != null && (tileId = gVar.getTileId()) != null) {
            builderBuildUpon.appendQueryParameter("tile_id", tileId);
        }
        if (gVar != null && (messageId = gVar.getMessageId()) != null) {
            builderBuildUpon.appendQueryParameter("message_id", messageId);
        }
        if (gVar != null && (campaignId = gVar.getCampaignId()) != null) {
            builderBuildUpon.appendQueryParameter("campaign_id", campaignId);
        }
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
