package ard;

import android.nfc.Tag;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f8653b;

    public /* synthetic */ h0(ProducerScope producerScope, int i) {
        this.f8652a = i;
        this.f8653b = producerScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f8652a;
        ProducerScope producerScope = this.f8653b;
        switch (i) {
            case 0:
                Unit unit = Unit.f186387a;
                com.bumptech.glide.c.E(producerScope, unit);
                return unit;
            case 1:
                Tag tag2 = (Tag) obj2;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "NfcDelegate", "Tag detected: " + tag2, null, null, 16);
                producerScope.mo3647trySendJP2dKIU(tag2);
                return Unit.f186387a;
            default:
                Unit unit2 = Unit.f186387a;
                com.bumptech.glide.c.E(producerScope, unit2);
                return unit2;
        }
    }
}
