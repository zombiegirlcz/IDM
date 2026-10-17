package x6;

import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkSpecDao_Impl f303004b;

    public /* synthetic */ a(WorkSpecDao_Impl workSpecDao_Impl, int i) {
        this.f303003a = i;
        this.f303004b = workSpecDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303003a) {
            case 0:
                return this.f303004b.lambda$__fetchRelationshipWorkTagAsjavaLangString$0((HashMap) obj2);
            default:
                return this.f303004b.lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1((HashMap) obj2);
        }
    }
}
