package c88;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import oki.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f22139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yki.b f22140c;

    public /* synthetic */ c(Ref$ObjectRef ref$ObjectRef, h hVar, yki.b bVar, int i) {
        this.f22138a = i;
        this.f22139b = ref$ObjectRef;
        this.f22140c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f22138a;
        yki.b bVar = this.f22140c;
        Ref$ObjectRef ref$ObjectRef = this.f22139b;
        switch (i) {
            case 0:
                od0.a aVar = od0.a.f224253a;
                if (!od0.a.i() && ref$ObjectRef.f186409a == null) {
                    h.D2(bVar);
                }
                break;
            case 1:
                od0.a aVar2 = od0.a.f224253a;
                if (!od0.a.i() && ref$ObjectRef.f186409a == null) {
                    h.D2(bVar);
                }
                break;
            default:
                od0.a aVar3 = od0.a.f224253a;
                if (!od0.a.i() && ref$ObjectRef.f186409a == null) {
                    h.D2(bVar);
                }
                break;
        }
        return Unit.f186387a;
    }
}
