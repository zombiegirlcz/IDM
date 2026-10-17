package ch;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Feature[] f24030a = new Feature[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Feature f24031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature f24032c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Feature f24033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Feature f24034h;
    public static final Feature i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Feature f24035j;
    public static final Feature k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Feature f24036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final zzai f24037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final zzai f24038n;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f24031b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        Feature feature3 = new Feature("vision.face", 1L);
        f24032c = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        Feature feature5 = new Feature("vision.ocr", 1L);
        d = feature5;
        e = new Feature("mlkit.ocr.chinese", 1L);
        f = new Feature("mlkit.ocr.common", 1L);
        f24033g = new Feature("mlkit.ocr.devanagari", 1L);
        f24034h = new Feature("mlkit.ocr.japanese", 1L);
        i = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        new Feature("mlkit.image.caption", 1L);
        new Feature("mlkit.docscan.detect", 1L);
        new Feature("mlkit.docscan.crop", 1L);
        new Feature("mlkit.docscan.enhance", 1L);
        f24035j = new Feature("mlkit.docscan.ui", 1L);
        k = new Feature("mlkit.docscan.stain", 1L);
        f24036l = new Feature("mlkit.docscan.shadow", 1L);
        new Feature("mlkit.quality.aesthetic", 1L);
        new Feature("mlkit.quality.technical", 1L);
        new Feature("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza("barcode", feature);
        zzahVar.zza("custom_ica", feature2);
        zzahVar.zza("face", feature3);
        zzahVar.zza("ica", feature4);
        zzahVar.zza("ocr", feature5);
        zzahVar.zza("langid", feature6);
        zzahVar.zza("nlclassifier", feature7);
        zzahVar.zza("tflite_dynamite", feature8);
        zzahVar.zza("barcode_ui", feature9);
        zzahVar.zza("smart_reply", feature10);
        f24037m = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzahVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzahVar2.zza("com.google.android.gms.vision.face", feature3);
        zzahVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzahVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzahVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzahVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzahVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzahVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        f24038n = zzahVar2.zzb();
    }

    public static void a(Context context, List list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            b(context, c(list, f24037m));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, final Feature[] featureArr) {
        ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: ch.v
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = k.f24030a;
                return featureArr;
            }
        }).build()).addOnFailureListener(new ah.a(2));
    }

    public static Feature[] c(List list, Map map) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            featureArr[i2] = (Feature) Preconditions.checkNotNull((Feature) map.get(list.get(i2)));
        }
        return featureArr;
    }
}
