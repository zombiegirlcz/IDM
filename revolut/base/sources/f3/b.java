package f3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.tooling.PreviewActivity;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131855a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f131856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f131857c;
    public final /* synthetic */ Object[] d;

    public /* synthetic */ b(String str, String str2, Object[] objArr) {
        this.f131856b = str;
        this.f131857c = str2;
        this.d = objArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f131855a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return PreviewActivity.setParameterizedContent$lambda$0(this.d, this.f131856b, this.f131857c, composer, iIntValue);
            default:
                return PreviewActivity.setParameterizedContent$lambda$1(this.f131856b, this.f131857c, this.d, composer, iIntValue);
        }
    }

    public /* synthetic */ b(Object[] objArr, String str, String str2) {
        this.d = objArr;
        this.f131856b = str;
        this.f131857c = str2;
    }
}
