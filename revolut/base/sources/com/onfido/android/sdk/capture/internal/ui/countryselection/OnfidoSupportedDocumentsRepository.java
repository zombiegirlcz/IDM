package com.onfido.android.sdk.capture.internal.ui.countryselection;

import cim.b;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.document.GenericDocument;
import com.onfido.android.sdk.capture.document.supported.data.remote.datasource.AllDocumentsDataSource;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.CountryCodeExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\f\u001a\u00020\tH\u0017J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/OnfidoSupportedDocumentsRepository;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "allDocumentsDataSource", "Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/AllDocumentsDataSource;", "(Lcom/onfido/android/sdk/capture/OnfidoConfig;Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/AllDocumentsDataSource;)V", "findAllSupportedCountries", "", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "findGenericDocuments", "Lcom/onfido/android/sdk/capture/document/GenericDocument;", "countryCode", "findSupportedDocumentTypes", "Lcom/onfido/android/sdk/capture/DocumentType;", "isDocumentAllowed", "", "supportedDocument", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class OnfidoSupportedDocumentsRepository implements SupportedDocumentsRepository {

    @NotNull
    private final AllDocumentsDataSource allDocumentsDataSource;

    @NotNull
    private final OnfidoConfig onfidoConfig;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository$findSupportedDocumentTypes$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "doc", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "invoke", "(Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<SupportedDocument, Boolean> {
        final /* synthetic */ CountryCode $countryCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CountryCode countryCode) {
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
                com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository r0 = com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository.this
                boolean r0 = com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository.access$isDocumentAllowed(r0, r3)
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
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository.AnonymousClass1.invoke(com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocument):java.lang.Boolean");
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository$findSupportedDocumentTypes$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/DocumentType;", "it", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<SupportedDocument, DocumentType> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DocumentType invoke(@NotNull SupportedDocument it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return it8.getDocumentType();
        }
    }

    public OnfidoSupportedDocumentsRepository(@NotNull OnfidoConfig onfidoConfig, @NotNull AllDocumentsDataSource allDocumentsDataSource) {
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(allDocumentsDataSource, "allDocumentsDataSource");
        this.onfidoConfig = onfidoConfig;
        this.allDocumentsDataSource = allDocumentsDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDocumentAllowed(SupportedDocument supportedDocument) {
        return this.onfidoConfig.getDocumentTypes().isEmpty() || d0.T(this.onfidoConfig.getDocumentTypes(), supportedDocument.getDocumentType());
    }

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<CountryCode> findAllSupportedCountries() {
        Object objA;
        List<SupportedDocument> listAllSupportedDocuments = this.allDocumentsDataSource.allSupportedDocuments();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listAllSupportedDocuments) {
            if (((SupportedDocument) obj2).getDocumentType() != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (d0.T(this.onfidoConfig.getDocumentTypes(), ((SupportedDocument) obj3).getDocumentType())) {
                arrayList2.add(obj3);
            }
        }
        if (!arrayList2.isEmpty()) {
            listAllSupportedDocuments = arrayList2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj4 : listAllSupportedDocuments) {
            String countryCodeAlpha2 = ((SupportedDocument) obj4).getCountryCodeAlpha2();
            Object objO = linkedHashMap.get(countryCodeAlpha2);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, countryCodeAlpha2);
            }
            ((List) objO).add(obj4);
        }
        CountryCode[] countryCodeArrValues = CountryCode.values();
        ArrayList arrayList3 = new ArrayList();
        for (CountryCode countryCode : countryCodeArrValues) {
            List list = (List) linkedHashMap.get(countryCode.name());
            if (list != null) {
                arrayList3.add(list);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : arrayList3) {
            List list2 = (List) obj5;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (((SupportedDocument) it8.next()).getHasValidUseCase()) {
                        arrayList4.add(obj5);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            SupportedDocument supportedDocument = (SupportedDocument) d0.d0((List) it9.next());
            CountryCode countryCode2 = null;
            if (supportedDocument != null) {
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
                CountryCode countryCode3 = (CountryCode) objA;
                if (countryCode3 != null) {
                    countryCode3.setNativeName(supportedDocument.getCountryNativeName());
                    countryCode3.setLocaleName(supportedDocument.getCountryLocaleName());
                    countryCode2 = countryCode3;
                }
            }
            if (countryCode2 != null) {
                arrayList5.add(countryCode2);
            }
        }
        List<GenericDocument> genericDocuments = this.onfidoConfig.getGenericDocuments();
        ArrayList arrayList6 = new ArrayList(w.t(genericDocuments, 10));
        Iterator<T> it10 = genericDocuments.iterator();
        while (it10.hasNext()) {
            arrayList6.add(((GenericDocument) it10.next()).getCountryCode());
        }
        return d0.U(d0.P0(d0.E0(arrayList6, arrayList5), new Comparator() { // from class: com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository$findAllSupportedCountries$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b(CountryCodeExtensionsKt.getDisplayName((CountryCode) t2), CountryCodeExtensionsKt.getDisplayName((CountryCode) t3));
            }
        }));
    }

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<GenericDocument> findGenericDocuments(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List<GenericDocument> genericDocuments = this.onfidoConfig.getGenericDocuments();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : genericDocuments) {
            if (((GenericDocument) obj2).getCountryCode() == countryCode) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository
    @NotNull
    public List<DocumentType> findSupportedDocumentTypes(@NotNull CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return y.J(y.F(y.k(y.z(y.n(d0.Q(this.allDocumentsDataSource.allSupportedDocuments()), new AnonymousClass1(countryCode)), AnonymousClass2.INSTANCE)), new Comparator() { // from class: com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository$findSupportedDocumentTypes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return b.b(Integer.valueOf(((DocumentType) t2).ordinal()), Integer.valueOf(((DocumentType) t3).ordinal()));
            }
        }));
    }
}
