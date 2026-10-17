package t8e;

import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChosenBackground f268886b;

    public /* synthetic */ e(ChosenBackground chosenBackground, int i) {
        this.f268885a = i;
        this.f268886b = chosenBackground;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f268885a) {
            case 0:
                return a.a((a) obj2, null, this.f268886b.f63742b.getE(), 3);
            default:
                return v7e.g.a((v7e.g) obj2, null, this.f268886b, null, null, 27);
        }
    }
}
