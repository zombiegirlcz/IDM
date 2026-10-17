package ku9;

import android.os.Bundle;
import androidx.content.NavDeepLink;
import androidx.content.internal.NavDestinationImpl;
import ipa.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f189758b;

    public /* synthetic */ b(int i, Bundle bundle) {
        this.f189757a = i;
        this.f189758b = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean matchingArguments$lambda$13;
        switch (this.f189757a) {
            case 0:
                n author = (n) obj2;
                Intrinsics.checkNotNullParameter(author, "author");
                return new lu9.a(author, String.valueOf(this.f189758b.getCharSequence("text")));
            case 1:
                matchingArguments$lambda$13 = NavDeepLink.getMatchingArguments$lambda$13(this.f189758b, (String) obj2);
                break;
            default:
                matchingArguments$lambda$13 = NavDestinationImpl.hasRequiredArguments$lambda$7(this.f189758b, (String) obj2);
                break;
        }
        return Boolean.valueOf(matchingArguments$lambda$13);
    }
}
