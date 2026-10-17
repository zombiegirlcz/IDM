package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import com.fourthline.vision.RecordingType;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class qi1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32452a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f32454c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f32456h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f32457j;
    public final /* synthetic */ Function k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function f32458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f32459m;

    public /* synthetic */ qi1(RecordingType recordingType, com.fourthline.vision.internal.rd rdVar, com.fourthline.vision.internal.u uVar, boolean z, Flow flow, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function2 function2, int i, int i2) {
        this.f32455g = recordingType;
        this.f32456h = rdVar;
        this.i = uVar;
        this.f32453b = z;
        this.f32457j = flow;
        this.k = function1;
        this.f32458l = function12;
        this.f32459m = function13;
        this.f32454c = function0;
        this.d = function2;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f32452a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return a40.a((String) this.f32455g, (String) this.f32456h, (List) this.i, (z10) this.f32457j, this.d, this.f32454c, (Function3) this.k, (Function3) this.f32458l, (n80) this.f32459m, this.f32453b, this.e, this.f, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return com.fourthline.vision.internal.yf.VisionXComposable$lambda$6((RecordingType) this.f32455g, (com.fourthline.vision.internal.rd) this.f32456h, (com.fourthline.vision.internal.u) this.i, this.f32453b, (Flow) this.f32457j, (Function1) this.k, (Function1) this.f32458l, (Function1) this.f32459m, this.f32454c, this.d, this.e, this.f, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ qi1(String str, String str2, List list, z10 z10Var, Function2 function2, Function0 function0, Function3 function3, Function3 function32, n80 n80Var, boolean z, int i, int i2) {
        this.f32455g = str;
        this.f32456h = str2;
        this.i = list;
        this.f32457j = z10Var;
        this.d = function2;
        this.f32454c = function0;
        this.k = function3;
        this.f32458l = function32;
        this.f32459m = n80Var;
        this.f32453b = z;
        this.e = i;
        this.f = i2;
    }
}
