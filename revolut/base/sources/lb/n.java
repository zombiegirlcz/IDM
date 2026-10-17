package lb;

import com.fourthline.kyc.Person;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193505a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Person f193506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fourthline.kyc.internal.g f193507c;

    public /* synthetic */ n(Person person, com.fourthline.kyc.internal.g gVar) {
        this.f193506b = person;
        this.f193507c = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f193505a) {
            case 0:
                return com.fourthline.kyc.internal.g.a(this.f193507c, this.f193506b, (com.fourthline.kyc.internal.e) obj2);
            default:
                return com.fourthline.kyc.internal.g.a(this.f193506b, this.f193507c, (com.fourthline.kyc.internal.e) obj2);
        }
    }

    public /* synthetic */ n(com.fourthline.kyc.internal.g gVar, Person person) {
        this.f193507c = gVar;
        this.f193506b = person;
    }
}
