package x9h;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b9k.f f303729b;

    public /* synthetic */ a(b9k.f fVar, int i) {
        this.f303728a = i;
        this.f303729b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f303728a) {
            case 0:
                return (List) this.f303729b.f;
            default:
                return (List) this.f303729b.f13819g;
        }
    }
}
