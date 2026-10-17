package com.fourthline.kyc.internal;

import aem.q;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.ExtensionsKt;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProviderKt;
import com.fourthline.kyc.Address;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Contacts;
import com.fourthline.kyc.CountryCodes;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.EmploymentStatus;
import com.fourthline.kyc.Industry;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.Person;
import com.fourthline.kyc.Profession;
import com.fourthline.kyc.QesAttachment;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.TaxInfo;
import com.fourthline.orca.internal.ij1;
import com.fourthline.vision.internal.qh;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.a0;
import lb.p;
import lb.r;

/* JADX INFO: loaded from: classes23.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimestampProvider f26554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SimpleDateFormat f26556c;
    private final SimpleDateFormat d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DocumentFileSide.values().length];
            try {
                iArr2[DocumentFileSide.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DocumentFileSide.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DocumentFileSide.INSIDE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DocumentFileSide.INSIDE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EmploymentStatus.values().length];
            try {
                iArr3[EmploymentStatus.EMPLOYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[EmploymentStatus.UNEMPLOYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[EmploymentStatus.SELF_EMPLOYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public g(TimestampProvider timestampProvider, String str) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        this.f26554a = timestampProvider;
        this.f26555b = str;
        this.f26556c = b("yyyy-MM-dd");
        this.d = b("yyyy-MM-dd'T'HH:mm:ss'Z'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Person person, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String lastName = person.getLastName();
        Intrinsics.h(lastName);
        invoke.a(lastName);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(CountryCodes.INSTANCE.mapToAlpha3IfNeeded$fourthline_kyc_release(str));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(CountryCodes.INSTANCE.mapToAlpha3IfNeeded$fourthline_kyc_release(str));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    @Override // com.fourthline.kyc.internal.k
    public String a(KycInfo kyc2) {
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        return f.a("SafenedKYC", new lb.f(kyc2, this)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(g gVar, KycInfo kycInfo, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        gVar.a(invoke, kycInfo.getDocument());
        gVar.b(invoke, kycInfo.getSecondaryDocuments());
        gVar.a(invoke, kycInfo.getSelfie());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(CountryCodes.INSTANCE.mapToAlpha3IfNeeded$fourthline_kyc_release(str));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Attachment.Nfc nfc2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("File", new Pair[0], new lb.k(nfc2, 4));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Attachment.Nfc nfc2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new qh(22));
        invoke.a("FileType", new Pair[0], new qh(23));
        Coordinate location = nfc2.getLocation();
        if (location != null) {
            invoke.a("Latitude", new Pair[0], new lb.e(location, 8));
            invoke.a("Longitude", new Pair[0], new lb.e(location, 9));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("MP4");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Selfie Video");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Front");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("MP4");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("No");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("PDF");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(KycInfo kycInfo, g gVar, e xml2) {
        Intrinsics.checkNotNullParameter(xml2, "$this$xml");
        xml2.a("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
        String clientNumber = kycInfo.getProvider().getClientNumber();
        Intrinsics.h(clientNumber);
        xml2.a("ClientNumberProvider", clientNumber);
        String str = gVar.d.format(gVar.f26554a.getCurrentTime());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        xml2.a("ModifiedDateTime", str);
        String name = kycInfo.getProvider().getName();
        Intrinsics.h(name);
        xml2.a("Provider", name);
        xml2.a("Identification", new Pair[0], new lb.f(gVar, kycInfo, 1));
        gVar.a(xml2, kycInfo.getProfession());
        gVar.a(xml2, kycInfo.getMetadata(), hb.a.f150533b ? gVar.f26555b : null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Map.Entry entry, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(ExtensionsKt.toHex((byte[]) entry.getValue()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Selfie");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Front");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("JPG");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Attachment.Nfc nfc2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Files", new Pair[0], new lb.k(nfc2, 3));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Document Video");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Attachment.Selfie selfie, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Documents/" + selfie.getVideoUUID$fourthline_kyc_release() + ".mp4");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Person person, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String firstName = person.getFirstName();
        Intrinsics.h(firstName);
        invoke.a(firstName);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("JPG");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(SimpleDateFormat simpleDateFormat, Date date, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(CountryCodes.INSTANCE.mapToAlpha3IfNeeded$fourthline_kyc_release(str));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Document document, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Documents/" + document.getVideoUUID$fourthline_kyc_release() + ".mp4");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Attachment.Selfie selfie, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("File", new Pair[0], new lb.a(selfie, 4));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(SimpleDateFormat simpleDateFormat, Date date, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Front");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Attachment.Nfc nfc2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String mrz = nfc2.getMrz();
        Intrinsics.h(mrz);
        invoke.a(a0.D(mrz, "\n", "", false));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(SimpleDateFormat simpleDateFormat, Date date, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(g gVar, long j2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = gVar.d.format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(g gVar, long j2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = gVar.d.format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Attachment.Selfie selfie, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Documents/" + selfie.getUuid() + ".jpg");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(g gVar, long j2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = gVar.d.format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Attachment.Selfie selfie, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new lb.a(selfie, 1));
        invoke.a("Side", new Pair[0], new qh(13));
        invoke.a("FileType", new Pair[0], new qh(14));
        Coordinate location = selfie.getLocation();
        if (location != null) {
            invoke.a("Latitude", new Pair[0], new lb.e(location, 1));
            invoke.a("Longitude", new Pair[0], new lb.e(location, 2));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Map.Entry entry, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(((Number) entry.getKey()).intValue()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(QesAttachment qesAttachment, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("DocumentsToSign/" + qesAttachment.getId() + ".pdf");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("EmbeddedData/face.jpg");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, KycInfo kycInfo, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        gVar.a(invoke, kycInfo.getPerson());
        gVar.a(invoke, kycInfo.getAddress());
        gVar.a(invoke, kycInfo.getContacts());
        invoke.a("Documents", new Pair[0], new lb.f(gVar, kycInfo, 2));
        gVar.a(invoke, kycInfo.getDocumentsToSign());
        gVar.a(invoke, kycInfo.getTaxInfo());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLongitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Document document, e invoke) {
        Coordinate location;
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new lb.d(document, 2));
        invoke.a("Side", new Pair[0], new qh(24));
        invoke.a("FileType", new Pair[0], new qh(25));
        VideoRecording videoRecording = document.getVideoRecording();
        if (videoRecording != null && (location = videoRecording.getLocation()) != null) {
            invoke.a("Latitude", new Pair[0], new lb.e(location, 0));
            invoke.a("Longitude", new Pair[0], new lb.e(location, 3));
        }
        return Unit.f186387a;
    }

    private final e a(e eVar, Person person) {
        return eVar.a("Person", new Pair[0], new lb.n(person, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final Person person, g gVar, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Type", new Pair[0], new qh(16));
        final int i = 0;
        invoke.a("Name", new Pair[0], new Function1() { // from class: lb.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        return com.fourthline.kyc.internal.g.a(person, (com.fourthline.kyc.internal.e) obj2);
                    case 1:
                        return com.fourthline.kyc.internal.g.b(person, (com.fourthline.kyc.internal.e) obj2);
                    default:
                        return com.fourthline.kyc.internal.g.c(person, (com.fourthline.kyc.internal.e) obj2);
                }
            }
        });
        final int i2 = 1;
        invoke.a("FirstName", new Pair[0], new Function1() { // from class: lb.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        return com.fourthline.kyc.internal.g.a(person, (com.fourthline.kyc.internal.e) obj2);
                    case 1:
                        return com.fourthline.kyc.internal.g.b(person, (com.fourthline.kyc.internal.e) obj2);
                    default:
                        return com.fourthline.kyc.internal.g.c(person, (com.fourthline.kyc.internal.e) obj2);
                }
            }
        });
        String middleName = person.getMiddleName();
        if (middleName != null) {
            invoke.a("MiddleName", new Pair[0], new lb.j(middleName, 4));
        }
        final int i3 = 2;
        invoke.a("LastName", new Pair[0], new Function1() { // from class: lb.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        return com.fourthline.kyc.internal.g.a(person, (com.fourthline.kyc.internal.e) obj2);
                    case 1:
                        return com.fourthline.kyc.internal.g.b(person, (com.fourthline.kyc.internal.e) obj2);
                    default:
                        return com.fourthline.kyc.internal.g.c(person, (com.fourthline.kyc.internal.e) obj2);
                }
            }
        });
        String nationalityCode = person.getNationalityCode();
        if (nationalityCode != null) {
            invoke.a("Nationality", new Pair[0], new lb.j(nationalityCode, 5));
        }
        Gender gender = person.getGender();
        if (gender != null) {
            invoke.a("Gender", new Pair[0], new com.fourthline.core.location.internal.d(gVar, gender, 12));
        }
        String birthCountryCode = person.getBirthCountryCode();
        if (birthCountryCode != null) {
            invoke.a("CountryOfBirth", new Pair[0], new lb.j(birthCountryCode, 6));
        }
        String birthPlace = person.getBirthPlace();
        if (birthPlace != null) {
            invoke.a("PlaceOfBirth", new Pair[0], new lb.j(birthPlace, 7));
        }
        invoke.a("BirthDate", new Pair[0], new lb.n(gVar, person));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(g gVar, long j2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = gVar.d.format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(g gVar, SecondaryDocument secondaryDocument, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        DocumentType type = secondaryDocument.getType();
        Intrinsics.h(type);
        invoke.a(gVar.a(type));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Attachment.Document document, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(a(document));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Attachment.Selfie selfie, e invoke) {
        Coordinate location;
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("FileLocation", new Pair[0], new lb.a(selfie, 3));
        invoke.a("Side", new Pair[0], new qh(17));
        invoke.a("FileType", new Pair[0], new qh(18));
        VideoRecording videoRecording = selfie.getVideoRecording();
        if (videoRecording != null && (location = videoRecording.getLocation()) != null) {
            invoke.a("Latitude", new Pair[0], new lb.e(location, 4));
            invoke.a("Longitude", new Pair[0], new lb.e(location, 5));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Attachment.Selfie selfie, g gVar, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new qh(11));
        invoke.a("Files", new Pair[0], new lb.a(selfie, 0));
        Long timestamp = selfie.getTimestamp();
        if (timestamp != null) {
            invoke.a("TimeStamp", new Pair[0], new lb.b(gVar, timestamp.longValue(), 0));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Natural Person");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Person person, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String firstName = person.getFirstName();
        Intrinsics.h(firstName);
        String str = " ";
        if (person.getMiddleName() != null) {
            str = " " + person.getMiddleName() + " ";
        }
        String lastName = person.getLastName();
        Intrinsics.h(lastName);
        invoke.a(firstName + str + lastName);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, Gender gender, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String lowerCase = gender.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        invoke.a(gVar.a(lowerCase));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, Person person, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        SimpleDateFormat simpleDateFormat = gVar.f26556c;
        Date birthDate = person.getBirthDate();
        Intrinsics.h(birthDate);
        String str = simpleDateFormat.format(birthDate);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(QesAttachment qesAttachment, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String string = qesAttachment.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        invoke.a(string);
        return Unit.f186387a;
    }

    private final e a(e eVar, Address address) {
        if (address != null) {
            return eVar.a("Address", new Pair[0], new q(address, 7));
        }
        return null;
    }

    private final SimpleDateFormat b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Address address, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String street = address.getStreet();
        if (street != null) {
            invoke.a("Street", new Pair[0], new lb.j(street, 18));
        }
        Integer streetNumber = address.getStreetNumber();
        if (streetNumber != null) {
            invoke.a("StreetNumber", new Pair[0], new ij1(streetNumber.intValue(), 6));
        }
        String streetNumberSuffix = address.getStreetNumberSuffix();
        if (streetNumberSuffix != null) {
            invoke.a("StreetNumberSuffix", new Pair[0], new lb.j(streetNumberSuffix, 19));
        }
        String postalCode = address.getPostalCode();
        if (postalCode != null) {
            invoke.a("PostalCode", new Pair[0], new lb.j(postalCode, 20));
        }
        String region = address.getRegion();
        if (region != null) {
            invoke.a("Region", new Pair[0], new lb.j(region, 21));
        }
        String city = address.getCity();
        if (city != null) {
            invoke.a("City", new Pair[0], new lb.j(city, 22));
        }
        String countryCode = address.getCountryCode();
        if (countryCode != null) {
            invoke.a("Country", new Pair[0], new lb.j(countryCode, 23));
        }
        return Unit.f186387a;
    }

    private final void b(e eVar, List list) {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            eVar.a("IdentificationDocument", new Pair[0], new lb.l(this, (SecondaryDocument) it8.next(), 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(int i, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(i));
        return Unit.f186387a;
    }

    private final e a(e eVar, Contacts contacts) {
        if (contacts != null) {
            return eVar.a("EmailAndPhone", new Pair[0], new q(contacts, 8));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Contacts contacts, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String email = contacts.getEmail();
        if (email != null) {
            invoke.a("Email", new Pair[0], new lb.j(email, 1));
        }
        String phone = contacts.getPhone();
        if (phone != null) {
            invoke.a("Phone", new Pair[0], new lb.j(phone, 2));
        }
        String mobile = contacts.getMobile();
        if (mobile != null) {
            invoke.a("Mobile", new Pair[0], new lb.j(mobile, 3));
        }
        return Unit.f186387a;
    }

    private final e a(e eVar, Document document) {
        if (document == null) {
            return null;
        }
        eVar.a("IdentificationDocument", new Pair[0], new lb.g(document, this, document));
        VideoRecording videoRecording = document.getVideoRecording();
        if (videoRecording == null || videoRecording.getUrl() == null) {
            return null;
        }
        return eVar.a("IdentificationDocument", new Pair[0], new lb.g(document, document, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Document document, g gVar, Document document2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new r(gVar, document));
        String number = document.getNumber();
        if (number != null) {
            invoke.a("DocumentNumber", new Pair[0], new lb.j(number, 10));
        }
        invoke.a("Files", new Pair[0], new r(document, gVar));
        SimpleDateFormat simpleDateFormat = gVar.f26556c;
        Date issueDate = document.getIssueDate();
        if (issueDate != null) {
            invoke.a("IssueDate", new Pair[0], new lb.q(simpleDateFormat, issueDate, 2));
        }
        Date expirationDate = document.getExpirationDate();
        if (expirationDate != null) {
            invoke.a("ExpirationDate", new Pair[0], new lb.q(simpleDateFormat, expirationDate, 3));
        }
        Attachment.Nfc nfc2 = document.getNfc();
        if (nfc2 != null) {
            invoke.a("EmbeddedData", new Pair[0], new lb.k(nfc2, 2));
        }
        List<Attachment.Document> images = document2.getImages();
        Intrinsics.h(images);
        Long timestamp = images.get(0).getTimestamp();
        if (timestamp != null) {
            invoke.a("TimeStamp", new Pair[0], new lb.b(gVar, timestamp.longValue(), 4));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, Document document, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        DocumentType type = document.getType();
        Intrinsics.h(type);
        invoke.a(gVar.a(type));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Document document, g gVar, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        List<Attachment.Document> images = document.getImages();
        if (images != null) {
            Iterator<T> it8 = images.iterator();
            while (it8.hasNext()) {
                gVar.a(invoke, (Attachment.Document) it8.next());
            }
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SimpleDateFormat simpleDateFormat, Date date, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Attachment.Nfc nfc2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("MRZ", new Pair[0], new lb.k(nfc2, 0));
        Map<Integer, byte[]> dataGroups = nfc2.getDataGroups();
        if (dataGroups.isEmpty()) {
            dataGroups = null;
        }
        if (dataGroups != null) {
            invoke.a("NfcDataGroups", new Pair[0], new q(dataGroups, 10));
        }
        if (nfc2.getImage() != null) {
            invoke.a("EncodedFace", new Pair[0], new lb.k(nfc2, 1));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Map.Entry entry, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("NfcDataGroupNumber", new Pair[0], new lb.c(entry, 1));
        invoke.a("NfcData", new Pair[0], new lb.c(entry, 2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Coordinate coordinate, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(String.valueOf(coordinate.getLatitude()));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, long j2, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String str = gVar.d.format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        invoke.a(str);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Document document, Document document2, g gVar, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new qh(12));
        List<Attachment.Document> images = document.getImages();
        Intrinsics.h(images);
        Attachment.Document document3 = images.get(0);
        invoke.a("Files", new Pair[0], new lb.d(document2, 0));
        Long timestamp = document3.getTimestamp();
        if (timestamp != null) {
            invoke.a("TimeStamp", new Pair[0], new lb.b(gVar, timestamp.longValue(), 1));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Document document, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("File", new Pair[0], new lb.d(document, 1));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, SecondaryDocument secondaryDocument, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new lb.l(gVar, secondaryDocument, 1));
        invoke.a("Files", new Pair[0], new lb.l(secondaryDocument, gVar));
        SimpleDateFormat simpleDateFormat = gVar.f26556c;
        Date issueDate = secondaryDocument.getIssueDate();
        if (issueDate != null) {
            invoke.a("IssueDate", new Pair[0], new lb.q(simpleDateFormat, issueDate, 0));
        }
        Date expirationDate = secondaryDocument.getExpirationDate();
        if (expirationDate != null) {
            invoke.a("ExpirationDate", new Pair[0], new lb.q(simpleDateFormat, expirationDate, 1));
        }
        List<Attachment.Document> images = secondaryDocument.getImages();
        Intrinsics.h(images);
        Long timestamp = images.get(0).getTimestamp();
        if (timestamp != null) {
            invoke.a("TimeStamp", new Pair[0], new lb.b(gVar, timestamp.longValue(), 2));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(SecondaryDocument secondaryDocument, g gVar, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        List<Attachment.Document> images = secondaryDocument.getImages();
        if (images != null) {
            Iterator<T> it8 = images.iterator();
            while (it8.hasNext()) {
                gVar.a(invoke, (Attachment.Document) it8.next());
            }
        }
        return Unit.f186387a;
    }

    private static final String a(Attachment.Document document) {
        String upperCase = b.a(document).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private final void a(e eVar, Attachment.Document document) {
        eVar.a("File", new Pair[0], new p(document, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(final Attachment.Document document, g gVar, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        final int i = 0;
        invoke.a("FileLocation", new Pair[0], new Function1() { // from class: lb.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        return com.fourthline.kyc.internal.g.a(document, (com.fourthline.kyc.internal.e) obj2);
                    default:
                        return com.fourthline.kyc.internal.g.b(document, (com.fourthline.kyc.internal.e) obj2);
                }
            }
        });
        invoke.a("Side", new Pair[0], new p(gVar, document));
        final int i2 = 1;
        invoke.a("FileType", new Pair[0], new Function1() { // from class: lb.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        return com.fourthline.kyc.internal.g.a(document, (com.fourthline.kyc.internal.e) obj2);
                    default:
                        return com.fourthline.kyc.internal.g.b(document, (com.fourthline.kyc.internal.e) obj2);
                }
            }
        });
        Coordinate location = document.getLocation();
        if (location != null) {
            invoke.a("Latitude", new Pair[0], new lb.e(location, 6));
            invoke.a("Longitude", new Pair[0], new lb.e(location, 7));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Attachment.Document document, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Documents/" + document.getUuid() + "." + b.a(document));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, Attachment.Document document, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        DocumentFileSide fileSide = document.getFileSide();
        Intrinsics.h(fileSide);
        invoke.a(gVar.a(fileSide));
        return Unit.f186387a;
    }

    private final e a(e eVar, final Attachment.Selfie selfie) {
        if (selfie == null) {
            return null;
        }
        final int i = 0;
        eVar.a("IdentificationDocument", new Pair[0], new Function1() { // from class: lb.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        return com.fourthline.kyc.internal.g.a(selfie, this, (com.fourthline.kyc.internal.e) obj2);
                    default:
                        return com.fourthline.kyc.internal.g.b(selfie, this, (com.fourthline.kyc.internal.e) obj2);
                }
            }
        });
        VideoRecording videoRecording = selfie.getVideoRecording();
        if (videoRecording == null || videoRecording.getUrl() == null) {
            return null;
        }
        final int i2 = 1;
        return eVar.a("IdentificationDocument", new Pair[0], new Function1() { // from class: lb.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        return com.fourthline.kyc.internal.g.a(selfie, this, (com.fourthline.kyc.internal.e) obj2);
                    default:
                        return com.fourthline.kyc.internal.g.b(selfie, this, (com.fourthline.kyc.internal.e) obj2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Attachment.Selfie selfie, g gVar, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("DocumentType", new Pair[0], new qh(19));
        invoke.a("Files", new Pair[0], new lb.a(selfie, 5));
        Long timestamp = selfie.getTimestamp();
        if (timestamp != null) {
            invoke.a("TimeStamp", new Pair[0], new lb.b(gVar, timestamp.longValue(), 3));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Attachment.Selfie selfie, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("File", new Pair[0], new lb.a(selfie, 2));
        return Unit.f186387a;
    }

    private final e a(e eVar, TaxInfo taxInfo) {
        if (taxInfo != null) {
            return eVar.a("Tax", new Pair[0], new q(taxInfo, 9));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(TaxInfo taxInfo, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        String taxationCountryCode = taxInfo.getTaxationCountryCode();
        if (taxationCountryCode != null) {
            invoke.a("CountrySubjectToTaxation", new Pair[0], new lb.j(taxationCountryCode, 8));
        }
        String taxpayerIdentificationNumber = taxInfo.getTaxpayerIdentificationNumber();
        if (taxpayerIdentificationNumber != null) {
            invoke.a("TIN", new Pair[0], new lb.j(taxpayerIdentificationNumber, 9));
        }
        invoke.a("USPerson", new Pair[0], new qh(20));
        invoke.a("USTIN", new Pair[0], new qh(21));
        return Unit.f186387a;
    }

    private final e a(e eVar, Profession profession) {
        if (profession != null) {
            return eVar.a("Profession", new Pair[0], new com.fourthline.core.location.internal.b(profession, 13, profession, this));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Profession profession, Profession profession2, g gVar, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        EmploymentStatus employment = profession.getEmployment();
        if (employment != null) {
            invoke.a("Employment", new Pair[0], new com.fourthline.core.location.internal.d(gVar, employment, 10));
        }
        String profession3 = profession2.getProfession();
        if (profession3 != null) {
            invoke.a("Profession", new Pair[0], new lb.j(profession3, 0));
        }
        Industry industry = profession.getIndustry();
        if (industry != null) {
            invoke.a("Industry", new Pair[0], new com.fourthline.core.location.internal.d(gVar, industry, 11));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, EmploymentStatus employmentStatus, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(gVar.a(employmentStatus));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(g gVar, Industry industry, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(gVar.a(industry));
        return Unit.f186387a;
    }

    private final e a(e eVar, DeviceMetadata deviceMetadata, String str) {
        return eVar.a("DeviceMetaData", new Pair[0], new com.fourthline.core.location.internal.d(deviceMetadata, str, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(DeviceMetadata deviceMetadata, String str, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Language", new Pair[0], new lb.j(deviceMetadata.getLanguage(), 11));
        invoke.a("Region", new Pair[0], new lb.j(deviceMetadata.getRegion(), 12));
        invoke.a("Model", new Pair[0], new lb.j(deviceMetadata.getModel(), 13));
        String ipAddress = deviceMetadata.getIpAddress();
        if (ipAddress != null) {
            invoke.a("IpAddress", new Pair[0], new lb.j(ipAddress, 14));
        }
        Coordinate location = deviceMetadata.getLocation();
        if (location != null && location != LocationProviderKt.getNotProvidedCoordinate()) {
            invoke.a("Latitude", new Pair[0], new lb.e(location, 10));
            invoke.a("Longitude", new Pair[0], new lb.e(location, 11));
        }
        invoke.a("OsVersion", new Pair[0], new lb.j(deviceMetadata.getOsVersion(), 15));
        invoke.a("OsCompromised", new Pair[0], new q(deviceMetadata, 12));
        invoke.a("SdkVersion", new Pair[0], new lb.j(deviceMetadata.getSdkVersion(), 16));
        if (str != null) {
            invoke.a("AnalyticsID", new Pair[0], new lb.j(str, 17));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(DeviceMetadata deviceMetadata, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a(deviceMetadata.getOsCompromised() ? "true" : "false");
        return Unit.f186387a;
    }

    private final void a(e eVar, List list) {
        if (list.isEmpty()) {
            return;
        }
        eVar.a("DocumentsToSign", new Pair[0], new q(list, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(QesAttachment qesAttachment, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        invoke.a("Id", new Pair[0], new lb.h(qesAttachment, 0));
        invoke.a("FileLocation", new Pair[0], new lb.h(qesAttachment, 1));
        invoke.a("FileType", new Pair[0], new qh(15));
        return Unit.f186387a;
    }

    private final String a(DocumentType documentType) {
        switch (a.$EnumSwitchMapping$0[documentType.ordinal()]) {
            case 1:
                return "Passport";
            case 2:
            case 3:
                return "National ID Card";
            case 4:
            case 5:
                return "Driving License";
            case 6:
                return "Residence Permit";
            case 7:
                return "Paper ID";
            case 8:
                return "Proof of Residence";
            case 9:
                return "TIN Reference Document";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String a(DocumentFileSide documentFileSide) {
        int i = a.$EnumSwitchMapping$1[documentFileSide.ordinal()];
        if (i == 1) {
            return "Front";
        }
        if (i == 2) {
            return "Back";
        }
        if (i == 3) {
            return "Inside Left";
        }
        if (i == 4) {
            return "Inside Right";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String a(EmploymentStatus employmentStatus) {
        int i = a.$EnumSwitchMapping$2[employmentStatus.ordinal()];
        if (i == 1) {
            return "Yes";
        }
        if (i == 2) {
            return "No";
        }
        if (i == 3) {
            return "Self Employed";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String a(Industry industry) {
        return industry.getCode();
    }

    private final String a(String str) {
        String strValueOf;
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb6 = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            strValueOf = CharsKt.f(cCharAt, ENGLISH);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb6.append((Object) strValueOf);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb6.append(strSubstring);
        return sb6.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Map map, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        Iterator it8 = map.entrySet().iterator();
        while (it8.hasNext()) {
            invoke.a("NfcDataGroup", new Pair[0], new lb.c((Map.Entry) it8.next(), 0));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(List list, e invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            invoke.a("DocumentToSign", new Pair[0], new lb.h((QesAttachment) it8.next(), 2));
        }
        return Unit.f186387a;
    }
}
