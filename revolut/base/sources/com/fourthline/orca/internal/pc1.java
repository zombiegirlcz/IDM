package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.Gender;
import com.fourthline.core.location.Coordinate;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.orca.workflow.WorkflowResultsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class pc1 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Pair a(xj0 xj0Var) {
        Intrinsics.checkNotNullParameter(xj0Var, "<this>");
        WorkflowResults.IDV.Person personAsWorkflowDataPerson = WorkflowResultsKt.asWorkflowDataPerson(xj0Var);
        if (personAsWorkflowDataPerson != null) {
            return new Pair(personAsWorkflowDataPerson, new nl0(a(personAsWorkflowDataPerson)));
        }
        return null;
    }

    public static final Pair a(DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(deviceMetadata, "<this>");
        WorkflowResults.IDV.Geolocation geolocationAsWorkflowGeolocation = WorkflowResultsKt.asWorkflowGeolocation(deviceMetadata);
        if (geolocationAsWorkflowGeolocation != null) {
            return new Pair(geolocationAsWorkflowGeolocation, new b00(a(geolocationAsWorkflowGeolocation)));
        }
        return null;
    }

    public static final Pair a(l81 l81Var) {
        Intrinsics.checkNotNullParameter(l81Var, "<this>");
        WorkflowResults.IDV.TaxInfo taxInfoAsWorkflowDataTaxInfo = WorkflowResultsKt.asWorkflowDataTaxInfo(l81Var);
        if (taxInfoAsWorkflowDataTaxInfo != null) {
            return new Pair(taxInfoAsWorkflowDataTaxInfo, new w71(a(taxInfoAsWorkflowDataTaxInfo)));
        }
        return null;
    }

    public static final Pair a(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        WorkflowResults.IDV.Address addressAsWorkflowDataAddress = WorkflowResultsKt.asWorkflowDataAddress(zVar);
        if (addressAsWorkflowDataAddress != null) {
            return new Pair(addressAsWorkflowDataAddress, new d1(a(addressAsWorkflowDataAddress)));
        }
        return null;
    }

    public static final Pair a(eb ebVar) {
        Intrinsics.checkNotNullParameter(ebVar, "<this>");
        WorkflowResults.IDV.Contacts contactsAsWorkflowDataContacts = WorkflowResultsKt.asWorkflowDataContacts(ebVar);
        if (contactsAsWorkflowDataContacts != null) {
            return new Pair(contactsAsWorkflowDataContacts, new rc(a(contactsAsWorkflowDataContacts)));
        }
        return null;
    }

    private static final y a(WorkflowResults.IDV.Address address) {
        return new y(address.getStreet(), String.valueOf(address.getStreetNumber()), address.getStreetNumberSuffix(), address.getPostalCode(), address.getCity(), address.getCountryCode());
    }

    private static final ew a(WorkflowResults.IDV.Contacts contacts) {
        return new ew(contacts.getEmail(), contacts.getMobile(), contacts.getPhone());
    }

    private static final v71 a(WorkflowResults.IDV.TaxInfo taxInfo) {
        return new v71(taxInfo.getTaxationCountryCode(), taxInfo.getTaxNumber(), taxInfo.getUsPerson(), taxInfo.getUsTin());
    }

    private static final wj0 a(WorkflowResults.IDV.Person person) {
        String firstName = person.getFirstName();
        String str = " ";
        if (person.getMiddleName() != null) {
            str = " " + person.getMiddleName() + " ";
        }
        return new wj0("Natural Person", firstName + str + person.getLastName(), person.getFirstName(), person.getLastName(), person.getNationalityCode(), a(person.getGender()), person.getBirthDate(), person.getBirthPlace(), person.getBirthCountryCode());
    }

    private static final a00 a(WorkflowResults.IDV.Geolocation geolocation) {
        Coordinate location = geolocation.getLocation();
        String strValueOf = location != null ? String.valueOf(location.getLongitude()) : null;
        Coordinate location2 = geolocation.getLocation();
        return new a00(strValueOf, location2 != null ? String.valueOf(location2.getLatitude()) : null);
    }

    private static final String a(Gender gender) {
        int i = a.$EnumSwitchMapping$0[gender.ordinal()];
        if (i == 1) {
            return "Female";
        }
        if (i == 2) {
            return "Male";
        }
        if (i == 3) {
            return "Unknown";
        }
        throw new NoWhenBranchMatchedException();
    }
}
