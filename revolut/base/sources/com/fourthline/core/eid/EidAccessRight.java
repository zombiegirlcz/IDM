package com.fourthline.core.eid;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/fourthline/core/eid/EidAccessRight;", "", "<init>", "(Ljava/lang/String;I)V", "Address", "BirthName", "FamilyName", "GivenNames", "PlaceOfBirth", "DateOfBirth", "DoctoralDegree", "ArtisticName", "Pseudonym", "ValidUntil", "Nationality", "IssuingCountry", "DocumentType", "ResidencePermitI", "ResidencePermitII", "CommunityID", "AddressVerification", "AgeVerification", "WriteAddress", "WriteCommunityID", "WriteResidencePermitI", "WriteResidencePermitII", "CanAllowed", "PinManagement", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EidAccessRight {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EidAccessRight[] f26266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26267b;
    public static final EidAccessRight Address = new EidAccessRight("Address", 0);
    public static final EidAccessRight BirthName = new EidAccessRight("BirthName", 1);
    public static final EidAccessRight FamilyName = new EidAccessRight("FamilyName", 2);
    public static final EidAccessRight GivenNames = new EidAccessRight("GivenNames", 3);
    public static final EidAccessRight PlaceOfBirth = new EidAccessRight("PlaceOfBirth", 4);
    public static final EidAccessRight DateOfBirth = new EidAccessRight("DateOfBirth", 5);
    public static final EidAccessRight DoctoralDegree = new EidAccessRight("DoctoralDegree", 6);
    public static final EidAccessRight ArtisticName = new EidAccessRight("ArtisticName", 7);
    public static final EidAccessRight Pseudonym = new EidAccessRight("Pseudonym", 8);
    public static final EidAccessRight ValidUntil = new EidAccessRight("ValidUntil", 9);
    public static final EidAccessRight Nationality = new EidAccessRight("Nationality", 10);
    public static final EidAccessRight IssuingCountry = new EidAccessRight("IssuingCountry", 11);
    public static final EidAccessRight DocumentType = new EidAccessRight("DocumentType", 12);
    public static final EidAccessRight ResidencePermitI = new EidAccessRight("ResidencePermitI", 13);
    public static final EidAccessRight ResidencePermitII = new EidAccessRight("ResidencePermitII", 14);
    public static final EidAccessRight CommunityID = new EidAccessRight("CommunityID", 15);
    public static final EidAccessRight AddressVerification = new EidAccessRight("AddressVerification", 16);
    public static final EidAccessRight AgeVerification = new EidAccessRight("AgeVerification", 17);
    public static final EidAccessRight WriteAddress = new EidAccessRight("WriteAddress", 18);
    public static final EidAccessRight WriteCommunityID = new EidAccessRight("WriteCommunityID", 19);
    public static final EidAccessRight WriteResidencePermitI = new EidAccessRight("WriteResidencePermitI", 20);
    public static final EidAccessRight WriteResidencePermitII = new EidAccessRight("WriteResidencePermitII", 21);
    public static final EidAccessRight CanAllowed = new EidAccessRight("CanAllowed", 22);
    public static final EidAccessRight PinManagement = new EidAccessRight("PinManagement", 23);

    static {
        EidAccessRight[] eidAccessRightArrA = a();
        f26266a = eidAccessRightArrA;
        f26267b = s.n(eidAccessRightArrA);
    }

    private EidAccessRight(String str, int i) {
    }

    private static final /* synthetic */ EidAccessRight[] a() {
        return new EidAccessRight[]{Address, BirthName, FamilyName, GivenNames, PlaceOfBirth, DateOfBirth, DoctoralDegree, ArtisticName, Pseudonym, ValidUntil, Nationality, IssuingCountry, DocumentType, ResidencePermitI, ResidencePermitII, CommunityID, AddressVerification, AgeVerification, WriteAddress, WriteCommunityID, WriteResidencePermitI, WriteResidencePermitII, CanAllowed, PinManagement};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26267b;
    }

    public static EidAccessRight valueOf(String str) {
        return (EidAccessRight) Enum.valueOf(EidAccessRight.class, str);
    }

    public static EidAccessRight[] values() {
        return (EidAccessRight[]) f26266a.clone();
    }
}
