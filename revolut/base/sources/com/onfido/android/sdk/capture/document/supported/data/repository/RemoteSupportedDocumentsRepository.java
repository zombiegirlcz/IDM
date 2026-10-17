package com.onfido.android.sdk.capture.document.supported.data.repository;

import cim.b;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.document.GenericDocument;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.AllDocumentsDataSource;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.SupportedDocumentsApi;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.SupportedDocumentsLocalDataSource;
import com.onfido.android.sdk.capture.document.supported.data.remote.model.SupportedDocumentResponse;
import com.onfido.android.sdk.capture.document.supported.data.remote.model.SupportedDocumentsResponse;
import com.onfido.android.sdk.capture.document.supported.data.remote.model.SupportedDocumentsResponseKt;
import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocument;
import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.CountryCodeExtensionsKt;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import tgm.g;
import v0.a;
import yhm.j;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u001e\u0010%\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/onfido/android/sdk/capture/document/supported/data/repository/RemoteSupportedDocumentsRepository;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;", "supportedDocumentsApi", "Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/SupportedDocumentsApi;", "supportedDocumentsLocalDataSource", "Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/SupportedDocumentsLocalDataSource;", "allDocumentsDataSource", "Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/AllDocumentsDataSource;", "(Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/SupportedDocumentsApi;Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/SupportedDocumentsLocalDataSource;Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/AllDocumentsDataSource;)V", "countriesSupportedDocuments", "", "", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "getCountriesSupportedDocuments", "()Ljava/util/Map;", "countriesSupportedDocuments$delegate", "Lkotlin/Lazy;", "supportedCountries", "getSupportedCountries", "()Ljava/util/List;", "supportedCountries$delegate", "supportedDocumentTypes", "getSupportedDocumentTypes", "supportedDocumentTypes$delegate", "fetchSupportedDocuments", "Lio/reactivex/rxjava3/core/Completable;", "findAllSupportedCountries", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "findGenericDocuments", "Lcom/onfido/android/sdk/capture/document/GenericDocument;", "countryCode", "findSupportedDocumentTypes", "isDocumentAllowed", "", "supportedDocument", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "isDocumentAllowedForCountry", "countrySupportedDocuments", "documentType", "mapCountryCode", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RemoteSupportedDocumentsRepository implements SupportedDocumentsRepository {

    @NotNull
    private final AllDocumentsDataSource allDocumentsDataSource;

    /* JADX INFO: renamed from: countriesSupportedDocuments$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy countriesSupportedDocuments;

    /* JADX INFO: renamed from: supportedCountries$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportedCountries;

    /* JADX INFO: renamed from: supportedDocumentTypes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportedDocumentTypes;

    @NotNull
    private final SupportedDocumentsApi supportedDocumentsApi;

    @NotNull
    private final SupportedDocumentsLocalDataSource supportedDocumentsLocalDataSource;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository$findSupportedDocumentTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "doc", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "invoke", "(Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20071 extends u implements Function1<SupportedDocument, Boolean> {
        final /* synthetic */ CountryCode $countryCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20071(CountryCode countryCode) {
            super(1);
            this.$countryCode = countryCode;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        @Override // kotlin.jvm.functions.Function1
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(@org.jetbrains.annotations.NotNull com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocument r3) {
            /*
                r2 = this;
                java.lang.String r0 = "doc"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository r0 = com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository.this
                boolean r0 = com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository.access$isDocumentAllowed(r0, r3)
                if (r0 == 0) goto L25
                boolean r0 = r3.getHasValidUseCase()
                if (r0 == 0) goto L25
                java.lang.String r3 = r3.getCountryCodeAlpha2()
                com.onfido.android.sdk.capture.utils.CountryCode r0 = r2.$countryCode
                java.lang.String r0 = r0.name()
                r1 = 1
                boolean r3 = kotlin.text.a0.z(r3, r0, r1)
                if (r3 == 0) goto L25
                goto L26
            L25:
                r1 = 0
            L26:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository.C20071.invoke(com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocument):java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository$findSupportedDocumentTypes$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/DocumentType;", "it", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20082 extends u implements Function1<SupportedDocument, DocumentType> {
        public static final C20082 INSTANCE = new C20082();

        public C20082() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DocumentType invoke(@NotNull SupportedDocument it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return it8.getDocumentType();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository$findSupportedDocumentTypes$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/DocumentType;", "invoke", "(Lcom/onfido/android/sdk/capture/DocumentType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function1<DocumentType, Boolean> {
        final /* synthetic */ List<DocumentType> $countrySupportedDocuments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends DocumentType> list) {
            super(1);
            this.$countrySupportedDocuments = list;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DocumentType it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return Boolean.valueOf(RemoteSupportedDocumentsRepository.this.isDocumentAllowedForCountry(this.$countrySupportedDocuments, it8));
        }
    }

    public RemoteSupportedDocumentsRepository(@NotNull SupportedDocumentsApi supportedDocumentsApi, @NotNull SupportedDocumentsLocalDataSource supportedDocumentsLocalDataSource, @NotNull AllDocumentsDataSource allDocumentsDataSource) {
        Intrinsics.checkNotNullParameter(supportedDocumentsApi, "supportedDocumentsApi");
        Intrinsics.checkNotNullParameter(supportedDocumentsLocalDataSource, "supportedDocumentsLocalDataSource");
        Intrinsics.checkNotNullParameter(allDocumentsDataSource, "allDocumentsDataSource");
        this.supportedDocumentsApi = supportedDocumentsApi;
        this.supportedDocumentsLocalDataSource = supportedDocumentsLocalDataSource;
        this.allDocumentsDataSource = allDocumentsDataSource;
        this.supportedDocumentTypes = j.b(new RemoteSupportedDocumentsRepository$supportedDocumentTypes$2(this));
        this.supportedCountries = j.b(new RemoteSupportedDocumentsRepository$supportedCountries$2(this));
        this.countriesSupportedDocuments = j.b(new RemoteSupportedDocumentsRepository$countriesSupportedDocuments$2(this));
    }

    private final Map<String, List<DocumentType>> getCountriesSupportedDocuments() {
        return (Map) this.countriesSupportedDocuments.getValue();
    }

    private final List<String> getSupportedCountries() {
        return (List) this.supportedCountries.getValue();
    }

    private final List<DocumentType> getSupportedDocumentTypes() {
        return (List) this.supportedDocumentTypes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDocumentAllowed(SupportedDocument supportedDocument) {
        return getSupportedDocumentTypes().isEmpty() || d0.T(getSupportedDocumentTypes(), supportedDocument.getDocumentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDocumentAllowedForCountry(List<? extends DocumentType> countrySupportedDocuments, DocumentType documentType) {
        return countrySupportedDocuments.isEmpty() || countrySupportedDocuments.contains(documentType);
    }

    private final CountryCode mapCountryCode(SupportedDocument supportedDocument) {
        Object objA;
        try {
            m.Companion companion = m.INSTANCE;
            objA = CountryCode.valueOf(supportedDocument.getCountryCodeAlpha2());
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        CountryCode countryCode = (CountryCode) objA;
        if (countryCode == null) {
            return null;
        }
        countryCode.setNativeName(supportedDocument.getCountryNativeName());
        countryCode.setLocaleName(supportedDocument.getCountryLocaleName());
        return countryCode;
    }

    @NotNull
    public final Completable fetchSupportedDocuments() {
        g gVarG = this.supportedDocumentsApi.getSupportedDocuments().g(new igm.o() { // from class: com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository.fetchSupportedDocuments.1
            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                apply((SupportedDocumentsResponse) obj2);
                return Unit.f186387a;
            }

            public final void apply(@NotNull SupportedDocumentsResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                List<SupportedDocumentResponse> supportedDocuments = response.getSupportedDocuments();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (T t2 : supportedDocuments) {
                    String countryCode = ((SupportedDocumentResponse) t2).getCountryCode();
                    Object objO = linkedHashMap.get(countryCode);
                    if (objO == null) {
                        objO = a.o(linkedHashMap, countryCode);
                    }
                    ((List) objO).add(t2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Iterable iterable = (Iterable) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it8 = iterable.iterator();
                    while (it8.hasNext()) {
                        DocumentType documentType = SupportedDocumentsResponseKt.toDocumentType(((SupportedDocumentResponse) it8.next()).getDocumentType());
                        if (documentType != null) {
                            arrayList.add(documentType);
                        }
                    }
                    linkedHashMap2.put(key, arrayList);
                }
                RemoteSupportedDocumentsRepository.this.supportedDocumentsLocalDataSource.setDocuments(linkedHashMap2);
            }
        });
        igm.o oVar = new igm.o() { // from class: com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository.fetchSupportedDocuments.2
            @Override // igm.o
            @NotNull
            public final CompletableSource apply(@NotNull Unit it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return ogm.g.f225217a;
            }
        };
        Objects.requireNonNull(oVar, "mapper is null");
        ogm.a aVar = new ogm.a(gVarG, oVar, 6);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<CountryCode> findAllSupportedCountries() {
        List<SupportedDocument> listAllSupportedDocuments = this.allDocumentsDataSource.allSupportedDocuments();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listAllSupportedDocuments) {
            SupportedDocument supportedDocument = (SupportedDocument) obj2;
            if (getSupportedCountries().contains(supportedDocument.getCountryCodeAlpha3()) && d0.T(getSupportedDocumentTypes(), supportedDocument.getDocumentType())) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            listAllSupportedDocuments = arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : listAllSupportedDocuments) {
            String countryCodeAlpha2 = ((SupportedDocument) obj3).getCountryCodeAlpha2();
            Object objO = linkedHashMap.get(countryCodeAlpha2);
            if (objO == null) {
                objO = a.o(linkedHashMap, countryCodeAlpha2);
            }
            ((List) objO).add(obj3);
        }
        CountryCode[] countryCodeArrValues = CountryCode.values();
        ArrayList arrayList2 = new ArrayList();
        for (CountryCode countryCode : countryCodeArrValues) {
            List list = (List) linkedHashMap.get(countryCode.name());
            if (list != null) {
                arrayList2.add(list);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList2) {
            List list2 = (List) obj4;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (((SupportedDocument) it8.next()).getHasValidUseCase()) {
                        arrayList3.add(obj4);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            SupportedDocument supportedDocument2 = (SupportedDocument) d0.d0((List) it9.next());
            CountryCode countryCodeMapCountryCode = supportedDocument2 == null ? null : mapCountryCode(supportedDocument2);
            if (countryCodeMapCountryCode != null) {
                arrayList4.add(countryCodeMapCountryCode);
            }
        }
        return d0.P0(arrayList4, new Comparator() { // from class: com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository$findAllSupportedCountries$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b(CountryCodeExtensionsKt.getDisplayName((CountryCode) t2), CountryCodeExtensionsKt.getDisplayName((CountryCode) t3));
            }
        });
    }

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<GenericDocument> findGenericDocuments(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return f0.f322471a;
    }

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<DocumentType> findSupportedDocumentTypes(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List<SupportedDocument> listAllSupportedDocuments = this.allDocumentsDataSource.allSupportedDocuments();
        List<DocumentType> list = getCountriesSupportedDocuments().get(countryCode.getAlpha3());
        if (list == null) {
            list = f0.f322471a;
        }
        return y.J(y.F(y.k(y.n(y.z(y.n(d0.Q(listAllSupportedDocuments), new C20071(countryCode)), C20082.INSTANCE), new AnonymousClass3(list))), new Comparator() { // from class: com.onfido.android.sdk.capture.document.supported.data.repository.RemoteSupportedDocumentsRepository$findSupportedDocumentTypes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b(Integer.valueOf(((DocumentType) t2).ordinal()), Integer.valueOf(((DocumentType) t3).ordinal()));
            }
        }));
    }
}
