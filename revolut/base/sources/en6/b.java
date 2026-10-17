package en6;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.ui.Modifier;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f127744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f127745c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f127746g;

    public /* synthetic */ b(l lVar, ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration externalInstitutionsConfiguration, String str, boolean z, oe6.g gVar, String str2) {
        this.f127743a = 0;
        this.f127745c = lVar;
        this.d = externalInstitutionsConfiguration;
        this.e = str;
        this.f127744b = z;
        this.f127746g = gVar;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0382  */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 1984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: en6.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Enum r4, boolean z, Object obj5, int i) {
        this.f127743a = i;
        this.f127745c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = r4;
        this.f127744b = z;
        this.f127746g = obj5;
    }

    public /* synthetic */ b(String str, mch.b bVar, InstrumentsCollectionType instrumentsCollectionType, Data data, InstrumentsCollectionSortOption instrumentsCollectionSortOption, boolean z) {
        this.f127743a = 3;
        this.e = str;
        this.f127745c = bVar;
        this.d = instrumentsCollectionType;
        this.f = data;
        this.f127746g = instrumentsCollectionSortOption;
        this.f127744b = z;
    }

    public /* synthetic */ b(Function2 function2, ContextMenuScope contextMenuScope, Modifier modifier, boolean z, Function3 function3, Function0 function0) {
        this.f127743a = 1;
        this.f127745c = function2;
        this.d = contextMenuScope;
        this.e = modifier;
        this.f127744b = z;
        this.f = function3;
        this.f127746g = function0;
    }
}
