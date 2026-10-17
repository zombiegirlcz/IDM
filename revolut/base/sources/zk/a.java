package zk;

import com.onfido.api.client.data.DocumentMediaUploadResponse;
import com.onfido.api.client.data.LiveVideoChallenges;
import com.onfido.api.client.data.LiveVideoUpload;
import com.onfido.api.client.data.NfcProperties;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.api.client.data.SupportedDocuments;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import jh.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import rlm.j;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f322880b;

    public /* synthetic */ a(b bVar, int i) {
        this.f322879a = i;
        this.f322880b = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f322879a) {
            case 0:
                b this$0 = this.f322880b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Json json = this$0.f322881a;
                tul.b bVar = this$0.f322882b;
                bVar.getClass();
                HashMap map = new HashMap();
                HashMap mapL = tul.b.l();
                ArrayList arrayList = new ArrayList();
                HashMap map2 = new HashMap();
                map2.put("type", j.c("recite"));
                ArrayList arrayList2 = new ArrayList();
                for (Integer num : Arrays.asList(Integer.valueOf(ThreadLocalRandom.current().nextInt(0, 10)), Integer.valueOf(ThreadLocalRandom.current().nextInt(0, 10)), Integer.valueOf(ThreadLocalRandom.current().nextInt(0, 10)))) {
                    num.getClass();
                    arrayList2.add(j.b(num));
                }
                map2.put("query", new kotlinx.serialization.json.a(arrayList2));
                arrayList.add(new JsonObject(map2));
                HashMap map3 = new HashMap();
                map3.put("type", j.c("movement"));
                map3.put("query", j.c(new String[]{"turnLeft", "turnRight"}[((SecureRandom) bVar.f274637b).nextInt(2)]));
                arrayList.add(new JsonObject(map3));
                mapL.put("challenge", new kotlinx.serialization.json.a(arrayList));
                map.put("data", new JsonObject(mapL));
                JsonObject jsonObject = new JsonObject(map);
                Intrinsics.checkNotNullExpressionValue(jsonObject, "serializeLiveVideoChallenges(...)");
                return (LiveVideoChallenges) json.a(d.v(json.f187949b, o0.b(LiveVideoChallenges.class)), jsonObject);
            case 1:
                b this$02 = this.f322880b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Json json2 = this$02.f322881a;
                this$02.f322882b.getClass();
                HashMap map4 = new HashMap();
                map4.put("docs", new kotlinx.serialization.json.a(Collections.EMPTY_LIST));
                map4.put("issuers", new JsonObject(Collections.EMPTY_MAP));
                JsonObject jsonObject2 = new JsonObject(map4);
                Intrinsics.checkNotNullExpressionValue(jsonObject2, "supportedDocuments(...)");
                return (SupportedDocuments) json2.a(d.v(json2.f187949b, o0.b(SupportedDocuments.class)), new JsonObject(jsonObject2));
            case 2:
                b this$03 = this.f322880b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Json json3 = this$03.f322881a;
                this$03.f322882b.getClass();
                HashMap map5 = new HashMap();
                map5.put("nfc_supported", j.a(Boolean.FALSE));
                Intrinsics.checkNotNullExpressionValue(map5, "serializeNfcProperties(...)");
                return (NfcProperties) json3.a(d.v(json3.f187949b, o0.b(NfcProperties.class)), new JsonObject(map5));
            case 3:
                b this$04 = this.f322880b;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Json json4 = this$04.f322881a;
                this$04.f322882b.getClass();
                JsonObject jsonObject3 = new JsonObject(tul.b.l());
                Intrinsics.checkNotNullExpressionValue(jsonObject3, "serializeLiveVideoUpload(...)");
                return (LiveVideoUpload) json4.a(d.v(json4.f187949b, o0.b(LiveVideoUpload.class)), jsonObject3);
            case 4:
                b this$05 = this.f322880b;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Json json5 = this$05.f322881a;
                this$05.f322882b.getClass();
                HashMap map6 = new HashMap();
                map6.put("media_id", j.c("ANY_ID"));
                HashMap map7 = new HashMap();
                map7.put("uuid", j.c("ANY_ID"));
                map6.put("binary_media", new JsonObject(map7));
                Intrinsics.checkNotNullExpressionValue(map6, "serializeBinaryUpload(...)");
                return (DocumentMediaUploadResponse) json5.a(d.v(json5.f187949b, o0.b(DocumentMediaUploadResponse.class)), new JsonObject(map6));
            default:
                b this$06 = this.f322880b;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Json json6 = this$06.f322881a;
                this$06.f322882b.getClass();
                HashMap map8 = new HashMap();
                HashMap map9 = new HashMap();
                HashMap map10 = new HashMap();
                map10.put("max_total_retries", j.b(1));
                map9.put("blur", new JsonObject(map10));
                map8.put("on_device", new JsonObject(map9));
                HashMap map11 = new HashMap();
                map11.put("validations", new JsonObject(map8));
                HashMap map12 = new HashMap();
                Boolean bool = Boolean.FALSE;
                map12.put("enable_require_applicant_consents", j.a(bool));
                map12.put("enable_in_house_analytics", j.a(bool));
                map11.put("sdk_features", new JsonObject(map12));
                HashMap map13 = new HashMap();
                Map map14 = Collections.EMPTY_MAP;
                map13.put("video_settings", new JsonObject(map14));
                map11.put("motion_capture", new JsonObject(map13));
                HashMap map15 = new HashMap();
                map15.put("sign_upload", j.a(bool));
                map11.put("face_video_capture", new JsonObject(map15));
                map11.put("face_selfie_capture", new JsonObject(map14));
                JsonObject jsonObject4 = new JsonObject(map11);
                Intrinsics.checkNotNullExpressionValue(jsonObject4, "serializeSDKConfig(...)");
                return (SdkConfiguration) json6.a(d.v(json6.f187949b, o0.b(SdkConfiguration.class)), jsonObject4);
        }
    }
}
